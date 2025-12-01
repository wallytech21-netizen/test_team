import java.util.Scanner;
public class Proyecto{
    static int contador=1;
    static int nvop;
    static float sumai;
    static float sumae;
    static int i;
    static int j;
    static int icopia;
    static int jcopia;
    static int x;
    static float[] ingresos =new float[10000];
    static float[] cingresos =new float[10000];
    static float[] egresos =new float[10000];
    static float[] cegresos =new float[10000];
    static String[] conceptoin =new String[10000];
    static String[] conceptoeg =new String[10000];
    static String[] cconceptoin =new String[10000];
    static String[] cconceptoeg =new String[10000];
    static int[][] mesdiain= new int[10000][2];
    static int[][] cmesdiain = new int[10000][2];
    static int[][] mesdiaeg= new int[10000][2];
    static int[][] cmesdiaeg = new int[10000][2];
    static float suma;
    static int op;
    static int op1;
    static String respuestasi;
    static String mes;
    static String meta;
    static float valorx;
    static int valora;
    static boolean ingresado;
    static float percentage;
    static String[] meses={"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio","Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" };
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*System.out.println("Dame un texto: ");
        parte=sc.nextLine();
        conceptoin[0]=parte;
        System.out.println(conceptoin[0]);
        conceptoin[1]=sc.nextLine();*/
        while(true) {
            System.out.println("  ____  _                           _     _                    __        __    _ _      _     _____               _             \n" +
                    " | __ )(_) ___ _ ____   _____ _ __ (_) __| | ___  ___    __ _  \\ \\      / /_ _| | | ___| |_  |_   _| __ __ _  ___| | _____ _ __ \n" +
                    " |  _ \\| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\/ __|  / _` |  \\ \\ /\\ / / _` | | |/ _ \\ __|   | || '__/ _` |/ __| |/ / _ \\ '__|\n" +
                    " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) \\__ \\ | (_| |   \\ V  V / (_| | | |  __/ |_    | || | | (_| | (__|   <  __/ |   \n" +
                    " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/|___/  \\__,_|    \\_/\\_/ \\__,_|_|_|\\___|\\__|   |_||_|  \\__,_|\\___|_|\\_\\___|_|   \n" +
                    "                                                                                                                              ");
            System.out.println("¿Qué haremos hoy?");
            System.out.println("1.- Declarar Ingresos y Egresos");
            System.out.println("2.- Resumenes de Ingresos y Egresos");
            System.out.println("3.- Modelos de Ahorro");
            System.out.println("4.- Perfil");
            System.out.println("5.- Salir");
            op=sc.nextInt();
            if(op<1 || op>5){
                while(true) {
                    System.out.println("Opción inválida, por favor dame otra opcion correcta.");
                    op = sc.nextInt();
                    if (op >= 1 && op <= 5) break;
                }
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            }if(op==5) break;
            switch(op){
                case 1:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("  ____  _                           _     _                   _                       _       _             _        _                                                                                  \n" +
                            " | __ )(_) ___ _ ____   _____ _ __ (_) __| | ___  ___    __ _| |  _ __ ___   ___   __| |_   _| | ___     __| | ___  (_)_ __   __ _ _ __ ___  ___  ___  ___   _   _    ___  __ _ _ __ ___  ___  ___  ___ \n" +
                            " |  _ \\| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\/ __|  / _` | | | '_ ` _ \\ / _ \\ / _` | | | | |/ _ \\   / _` |/ _ \\ | | '_ \\ / _` | '__/ _ \\/ __|/ _ \\/ __| | | | |  / _ \\/ _` | '__/ _ \\/ __|/ _ \\/ __|\n" +
                            " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) \\__ \\ | (_| | | | | | | | | (_) | (_| | |_| | | (_) | | (_| |  __/ | | | | | (_| | | |  __/\\__ \\ (_) \\__ \\ | |_| | |  __/ (_| | | |  __/\\__ \\ (_) \\__ \\\n" +
                            " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/|___/  \\__,_|_| |_| |_| |_|\\___/ \\__,_|\\__,_|_|\\___/   \\__,_|\\___| |_|_| |_|\\__, |_|  \\___||___/\\___/|___/  \\__, |  \\___|\\__, |_|  \\___||___/\\___/|___/\n" +
                            "                                                                                                                             |___/                           |___/        |___/                         ");
                    System.out.println("¿Que quieres ingresar al sistema?");
                    System.out.println("1.- Ingresos");
                    System.out.println("2.- Egresos");
                    System.out.println("3.- Salir");
                    nvop=sc.nextInt();
                    while(nvop<1 || nvop>3) {
                        System.out.println("Opción incorrecta, por favor ingresa una opción válida.");
                        nvop = sc.nextInt();
                    }
                    if(nvop==1) iningresos(); //proceso de ingresos
                    else if(nvop==2) inegresos(); //proceso de egresos
                    break;
                //aquí termina el primer modulo
                case 2:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("  ____  _                           _     _                   _   __  __           _       _             _        ____                                      \n" +
                            " | __ )(_) ___ _ ____   _____ _ __ (_) __| | ___  ___    __ _| | |  \\/  | ___   __| |_   _| | ___     __| | ___  |  _ \\ ___  ___ _   _ _ __ ___   ___ _ __  \n" +
                            " |  _ \\| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\/ __|  / _` | | | |\\/| |/ _ \\ / _` | | | | |/ _ \\   / _` |/ _ \\ | |_) / _ \\/ __| | | | '_ ` _ \\ / _ \\ '_ \\ \n" +
                            " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) \\__ \\ | (_| | | | |  | | (_) | (_| | |_| | | (_) | | (_| |  __/ |  _ <  __/\\__ \\ |_| | | | | | |  __/ | | |\n" +
                            " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/|___/  \\__,_|_| |_|  |_|\\___/ \\__,_|\\__,_|_|\\___/   \\__,_|\\___| |_| \\_\\___||___/\\__,_|_| |_| |_|\\___|_| |_|\n" +
                            "                                                                                                                                                            ");
                    System.out.println("¿A que módulo de Resumen deseas ingresar?");
                    System.out.println("1.- Resumen de Ingresos");
                    System.out.println("2.- Resumen de Egresos");
                    System.out.println("3.- Salir");
                    nvop=sc.nextInt();
                    while(nvop<1 || nvop>3) {
                        System.out.println("Opción incorrecta, por favor ingresa una opción válida.");
                        nvop = sc.nextInt();
                    }
                    if(nvop==1) resingresos(); //proceso de ingresos
                    else if(nvop==2) resegresos(); //proceso de egresos

                    break;
                //aquí termina el segundo modulo
                case 3:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("   ____                       __  __           _      _             _           _    _                           \n" +
                            "  / ___|_ __ ___  __ _ _ __  |  \\/  | ___   __| | ___| | ___     __| | ___     / \\  | |__   ___  _ __ _ __ ___   \n" +
                            " | |   | '__/ _ \\/ _` | '__| | |\\/| |/ _ \\ / _` |/ _ \\ |/ _ \\   / _` |/ _ \\   / _ \\ | '_ \\ / _ \\| '__| '__/ _ \\  \n" +
                            " | |___| | |  __/ (_| | |    | |  | | (_) | (_| |  __/ | (_) | | (_| |  __/  / ___ \\| | | | (_) | |  | | | (_) | \n" +
                            "  \\____|_|  \\___|\\__,_|_|    |_|  |_|\\___/ \\__,_|\\___|_|\\___/   \\__,_|\\___| /_/   \\_\\_| |_|\\___/|_|  |_|  \\___/  \n" +
                            "                                                                                                                 ");
                    System.out.println("¿Que modelo de ahorro deseas crear?");
                    System.out.println("[1] 50/30/20 -> Presupuesto mensual por categorías.");
                    System.out.println("[2] A largo plazo -> Metas grandes, más de 5 años.");
                    System.out.println("[3] A mediano plazo -> Objetivos entre 1 y 5 años");
                    System.out.println("[4] A corto plazo  -> Ahorro para menos de un año.");
                    System.out.println("[5] Salir");
                    nvop=sc.nextInt();
                    while(nvop<1 || nvop>5) {
                        System.out.println("Opción incorrecta, por favor ingresa una opción válida.");
                        nvop = sc.nextInt();
                    }
                    if(nvop==1) primerm(); //proceso de 50/30/20
                    else if(nvop==2) segundom(); //proceso de largo plazo
                    else if(nvop==3) tercerm(); //proceso de mediano plazo
                    else if(nvop==4) cuartom(); //proceso de corto plazo
                    break;
                //aquí termina el tercer modulo
                case 4:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    System.out.println("  ____            __ _ _ \n" +
                            " |  _ \\ ___ _ __ / _(_) |\n" +
                            " | |_) / _ \\ '__| |_| | |\n" +
                            " |  __/  __/ |  |  _| | |\n" +
                            " |_|   \\___|_|  |_| |_|_|\n" +
                            "                         ");
                    for(int a=icopia; a<i; a++){
                        suma+=ingresos[a];
                    }
                    if(i==0) suma=0;
                    else suma/=i;
                    if(ingresado) suma=sumai;
                    System.out.println("Ingresos totales: "+suma);
                    for(int a=jcopia; a<j; a++){
                        suma+=egresos[a];
                    }
                    if(j==0) suma=0;
                    else suma/=j;
                    if(ingresado) suma=sumae;
                    System.out.println("Egresos totales: "+suma);
                    System.out.println("¿Quieres darle datos específicos a tus ingresos y egresos totales?");
                    System.out.println("1.- Si");
                    System.out.println("2.- No, continuar.");
                    nvop=sc.nextInt();
                    while(nvop<1 || nvop>2){
                        System.out.println("Opción incorrecta, por favor ingresa una opción válida.");
                        nvop = sc.nextInt();
                    }
                    if(nvop==1){
                        ingresado=true;
                        System.out.println("Por favor, dale un nuevo valor a tus ingresos totales: ");
                        sumai=sc.nextFloat();
                        System.out.println("Por favor, dale un nuevo valor a tus egresos totales: ");
                        sumae=sc.nextFloat();

                    }
                    break;
                //aquí termina el cuarto modulo
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println(" __        __    _ _      _     _____               _             \n" +
                    " \\ \\      / /_ _| | | ___| |_  |_   _| __ __ _  ___| | _____ _ __ \n" +
                    "  \\ \\ /\\ / / _` | | |/ _ \\ __|   | || '__/ _` |/ __| |/ / _ \\ '__|\n" +
                    "   \\ V  V / (_| | | |  __/ |_    | || | | (_| | (__|   <  __/ |   \n" +
                    "    \\_/\\_/ \\__,_|_|_|\\___|\\__|   |_||_|  \\__,_|\\___|_|\\_\\___|_|   \n" +
                    "                                                                  ");
            System.out.println("¿Quieres hacer otra cosa? Indica 1 o 2.");
            System.out.println("1.- Si, 2.- No (Salir).");
            int reg=sc.nextInt();
            while(reg<1 || reg>2){
                System.out.println("Opción incorrecta, por favor ingresa una opción válida.");
                reg = sc.nextInt();
            }
            if(reg==2) break;
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("   ____                _                                      _     _ _             _ \n" +
                "  / ___|_ __ __ _  ___(_) __ _ ___   _ __   ___  _ __  __   _(_)___(_) |_ __ _ _ __| |\n" +
                " | |  _| '__/ _` |/ __| |/ _` / __| | '_ \\ / _ \\| '__| \\ \\ / / / __| | __/ _` | '__| |\n" +
                " | |_| | | | (_| | (__| | (_| \\__ \\ | |_) | (_) | |     \\ V /| \\__ \\ | || (_| | |  |_|\n" +
                "  \\____|_|  \\__,_|\\___|_|\\__,_|___/ | .__/ \\___/|_|      \\_/ |_|___/_|\\__\\__,_|_|  (_)\n" +
                "                                    |_|                                               ");
        System.out.println("Gracias por visitar Wallet Tracker, vuelve pronto.");
        System.out.println("El sistema se cerrará en: ");
        for(int i=3; i>=1; i--){
            System.out.println(i);
        }
    } //fin del main

}
