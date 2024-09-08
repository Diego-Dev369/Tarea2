


public class PiramideSola {

    public static void main(String[] args) {
        /*int horas,minutos,segundos;
        
        for (horas = 0; horas <= 23; horas++) {
            for (minutos = 0; minutos <= 59; minutos++) {
                for (segundos = 0; segundos <= 59; segundos++) {
                    System.out.println(horas+":"+minutos+":"+segundos);
                }
            }  
        }*/
        //int numEspacios=0,numAst=9;
        
        /*for (int saltos = 1; saltos <= 5; saltos++) {
            for (int espacios = 1; espacios <= numEspacios; espacios++) {
                System.out.print("  ");
            }
            for (int asteriscos = 1; asteriscos <= numAst ; asteriscos++) {
                System.out.print("* ");
            }
            System.out.println("");
            numAst += 2;
            numEspacios--;
        }*/
        
        //inverso
        /*for (int saltos = 1; saltos <= 5; saltos++) {
            for (int espacios = 1; espacios <= numEspacios; espacios++) {
                System.out.print("  ");
            }
            for (int asteriscos = 1; asteriscos <= numAst ; asteriscos++) {
                System.out.print("* ");
            }
            System.out.println("");
            numAst -= 2;
            numEspacios++;
        }*/
        //Rombo
        int numEspacios=4,numAst=1;
        for (int saltos = 1; saltos <= 9; saltos++) {
            
            for (int espacios = 1; espacios <= numEspacios; espacios++) {
                System.out.print("  ");
            }
            for (int asteriscos = 1; asteriscos <= numAst ; asteriscos++) {
                System.out.print("* ");
            }
            System.out.println("");
            
            if(saltos < 5){
                numAst += 2;
                numEspacios--;
            }
            else{
                numAst -= 2;
                numEspacios++;
            }
        }
    }
}
