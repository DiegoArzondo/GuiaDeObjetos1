package Domain;

import java.util.Scanner;


    public class Hora {
        private int hora;
        private int minuto;
        private int segundo;

        public Hora() {
        }

        public int getHora() {
            return hora;
        }

        public int getMinuto() {
            return minuto;
        }

        public int getSegundo() {
            return segundo;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Hora: ");
            sb.append("").append(hora);
            sb.append(":").append(minuto);
            sb.append(":").append(segundo);
            return sb.toString();
        }

        private void iniciarHora(){

            Scanner entrada = new Scanner(System.in);
            do {
                System.out.println("Ingrese una hora valida");
                this.hora=Integer.parseInt(entrada.nextLine());
            }while(this.hora<0 || this.hora>23);
        }

        private void iniciarMinuto(){

            Scanner entrada = new Scanner(System.in);
            do {
                System.out.println("Ingrese un minuto valido");
                this.minuto=Integer.parseInt(entrada.nextLine());
            }while(this.minuto<0 || this.minuto>59);
        }

        private void iniciarSegundo(){

            Scanner entrada = new Scanner(System.in);
            do {
                System.out.println("Ingrese un segundo valido");
                this.segundo=Integer.parseInt(entrada.nextLine());
            }while(this.segundo<0 || this.segundo>59);
        }



        public void iniciarReloj(){
            System.out.println("RELOJ FORMATO 24HS\nSE LE PEDIRA LA HORA, LOS MINUTOS Y LOS SEGUNDOS POR SEPARADO");//
            iniciarHora();
            iniciarMinuto();
            iniciarSegundo();
        }


        public Hora avanzarUnSegundo(Hora hora){
            if(hora.hora==23 && hora.minuto==59 && hora.segundo==59){
                this.hora=0;
                this.minuto=0;
                this.segundo=0;
            }
            else if(hora.minuto==59 && hora.segundo==59){
                this.hora++;
                this.minuto=0;
                this.segundo=0;
            }
            else if(hora.segundo==59){
                this.minuto++;
                this.segundo=0;
            }
            else {
                this.segundo++;
            }
            return hora;
        }

        public Hora retrasarSegundo(Hora hora){
            if (hora.hora==0 && hora.minuto==0 && hora.segundo==0){
                this.hora=23;
                this.minuto=59;
                this.segundo=59;
            }
            else if (hora.minuto== 0 && hora.segundo==0){
                this.hora--;
                this.minuto=59;
                this.segundo=59;
            }
            else if(hora.segundo==00){
                this.minuto--;
                this.segundo=59;
            }
            else{
                this.segundo--;
            }
            return hora;
        }

    }

