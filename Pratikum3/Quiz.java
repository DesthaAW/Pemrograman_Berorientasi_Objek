package Pratikum3;

public class Quiz {
    private String[] question = {
        "Ibu kota Indonesia adalah?",
        "Hewan apa yang paling Kecil?",
        "Planet terbesar di tata surya kita adalah?",
        "Siapa presiden pertama Indonesia?",
        "Apa pulau terbesar di Indonesia?",
        "Masakan rendang berasal dari daerah?"
    };

    private String[][] options = {
        {"1. Jakarta", "2. Bandung", "3. Surabaya", "4. Bali"},
        {"1. Kucing", "2. Semut", "3. Anjing", "4. Gajah"}, 
        {"1. Bumi", "2. Mars", "3. Jupiter", "4. Saturnus"},
        {"1. Ir. Soekarno", "2. Soeharto", "3. Megawati", "4. Jokowi"},
        {"1. Jawa", "2. Sumatera", "3. Kalimantan", "4. Papua"},
        {"1. Sumatera", "2. Jawa", "3. Sulawesi", "4. Kalimantan"}
    };

    private int[] correctAnswers = {1, 2, 3, 1, 3, 1}; // Jawaban benar sesuai indeks
    private int score = 0;

    public int getQuestionCount() {
        return question.length;
    }

    public void displayQuestion(int index) {
        System.out.println("\nPertanyaan " + (index + 1) + ": " + question[index]);
        for (int i = 0; i < options[index].length; i++) {
            System.out.println(options[index][i]);
        }
    }

    public void checkAnswer(int index, int userAnswer) {
        if (userAnswer == correctAnswers[index]) {
            System.out.println("Jawaban Anda benar!");
            score += 10;
        } else {
            System.out.println("Salah! Jawaban yang benar adalah: " + options[index][correctAnswers[index] - 1]);
        }
    }

    public int getScore() {
        return score;
    }
}