import java.util.Scanner;

public class littleHelp {
    public static void main(String[] args) {

                Scanner seasons= new Scanner(System.in);
        System.out.println("Dime una estación del año");
        String season= seasons.nextLine();




        switch (season.toLowerCase()){
            case "primavera":
              System.out.println("En "+season+" las hojas de los árboles reverdecen y las flores aparecen.");
                    seasons.nextLine();
                    break;


            case "verano":{
                System.out.println("En "+ season +" hay que protegerse del sol, pero está bueno para ir a la playa.");
                break;
            }
            case "otoño":{
                System.out.println("En "+season+ " las hojas se pintan de tonos tierra y caen.");
                break;
            }
            case "invierno":{
                System.out.println("En "+season +" hace frío, perfecto momento para el chocolate caliente.");
                break;
            }
            default:
                System.out.println("Me gustan todas las estaciones. Pero, ¿Cuál te gusta a ti?");
                break;
        }
seasons.close();

        Scanner aid=new Scanner(System.in);

        String collection="";
       int response=0;
        int i = -1;
        int cash=0;
        do{
            System.out.println("¿Quieres colaborar con la colecta? s/n");
             collection= aid.nextLine();

          System.out.println("¿Con cuánto?");
          response=aid.nextInt();
           aid.nextLine();

           cash += response;

            i++;

       }

      while(collection.equals("s"));

        System.out.println("Aportaron " + i + " personas. Y se recaudó: " + cash + " euros");



aid.close();

//        3- SWITCH  - WHILE:


        Scanner sound=new Scanner(System.in);
        String answer; //inicializar la variable en el ámbito deseado
        do{ //dar una instrucción al programa

        System.out.println("Dime un número, ¿Qué sonido quieres escuchar?");
        int number= sound.nextInt();

        switch (number){
            case 1:
                System.out.println("Es una abeja y suena ZZZzzzzZZZZ");
                break;
            case 2:
                System.out.println("Es un gato y suena miau");
                break;
            case 3:
                System.out.println("Es un cerdo y suena oink oink");
                break;
            case 4:
                System.out.println("Es una oveja y suena meeeeeeh");
                break;
            case 5:
                System.out.println("Es una vaca y suena muuuuuu");
                break;
            default:
                System.out.println("El número debe estar entre 1 y 5");
               break;


        } sound.nextLine(); //Limpiar el buffer

            System.out.println("¿Quieres escuchar otro sonido? s/n");
            answer=sound.nextLine().toLowerCase();
    }while (answer.equals("s")); //Poner una condición en el ciclo para que se repita, o no




sound.close();
    }
}