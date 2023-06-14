public class Home2 {
    public static void main(String[] args) {

        String str = "фамилия ; Иванов ; оценка ; 5 ; предмет ;  Математика ; фамилия ; Петрова; оценка ; 4 ; предмет ; Информатика ;фамилия : Краснов , оценка: 5 , предмет : Физика";
        String[] strings = str
                .replaceAll("\\p{P}","")
                .replaceAll("\\s+", " ")
                .split(" ");

        int a=0;



        StringBuilder builder = new StringBuilder();
        int j = 0;
        for (int i = 0; i < strings.length; i+=6) {

            builder.append("Студент ").append(strings[j+1]).append(" получил ").append(strings[j+3]).append(" по предмету ").append(strings[j+5]).append('\n');

            System.out.println();
            j+=6;


        }
        System.out.println(builder);





        int b=0;
    }
}
