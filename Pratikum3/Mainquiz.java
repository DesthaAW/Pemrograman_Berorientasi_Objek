package Pratikum3;

import java.util.Scanner;

public class Mainquiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Quiz quiz = new Quiz();

        System.out.println("Selamat datang di kuis pengetahuan umum!");
        System.out.println("Pilih jawaban yang benar untuk setiap pertanyaan.\n");

        // Loop untuk setiap pertanyaan
        for (int i = 0; i < quiz.getQuestionCount(); i++) {
            quiz.displayQuestion(i);
            System.out.print("Jawaban Anda (1-4): ");
            
            // Validasi input agar hanya menerima angka 1-4
            int answer;
            while (true) {
                if (input.hasNextInt()) {
                    answer = input.nextInt();
                    if (answer >= 1 && answer <= 4) {
                        break;
                    } else {
                        System.out.print("Masukkan angka antara 1-4: ");
                    }
                } else {
                    System.out.print("Masukkan angka yang valid (1-4): ");
                    input.next(); // Membuang input yang tidak valid
                }
            }

            quiz.checkAnswer(i, answer);
        }

        // Menampilkan skor akhir
        int finalScore = quiz.getScore();
        System.out.println("\nKuis selesai! Skor akhir Anda: " + finalScore);

        // Pesan berdasarkan skor
        if (finalScore == 60) {
            System.out.println("Luar biasa! Anda menjawab semua pertanyaan dengan benar!");
        } else if (finalScore >= 40) {
            System.out.println("Bagus! Anda memiliki pengetahuan yang cukup baik.");
        } else if (finalScore >= 20) {
            System.out.println("Lumayan, tapi masih perlu belajar lebih banyak.");
        } else {
            System.out.println("Sayang sekali, coba lagi lain kali!");
        }

        input.close();
    }
}