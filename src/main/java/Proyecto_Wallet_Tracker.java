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

    public static void iningresos(){
        contador=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        icopia=i;
        System.out.println("  ____  _                           _     _               _                       _       _             _        _____                                     \n" +
                " |  _ \\(_)                         (_)   | |             | |                     | |     | |           | |      |_   _|                                    \n" +
                " | |_) |_  ___ _ ____   _____ _ __  _  __| | ___     __ _| |  _ __ ___   ___   __| |_   _| | ___     __| | ___    | |  _ __   __ _ _ __ ___  ___  ___  ___ \n" +
                " |  _ <| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\   / _` | | | '_ ` _ \\ / _ \\ / _` | | | | |/ _ \\   / _` |/ _ \\   | | | '_ \\ / _` | '__/ _ \\/ __|/ _ \\/ __|\n" +
                " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) | | (_| | | | | | | | | (_) | (_| | |_| | | (_) | | (_| |  __/  _| |_| | | | (_| | | |  __/\\__ \\ (_) \\__ \\\n" +
                " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/   \\__,_|_| |_| |_| |_|\\___/ \\__,_|\\__,_|_|\\___/   \\__,_|\\___| |_____|_| |_|\\__, |_|  \\___||___/\\___/|___/\n" +
                "                                                                                                                              __/ |                        \n" +
                "                                                                                                                             |___/                         ");
        System.out.println("Ingresa los siguientes datos en valores enteros, tomando en cuenta las siguientes instrucciones.");
        System.out.println("-El día no puede ser mayor a 31 días con respecto al mes de ingreso.");
        System.out.println("-Montos no negativos.");
        System.out.println("Nota: Te recordamos que cada vez que ingresas datos en este modulo, tu modulo de resumen cambia e inicia desde el primer nuevo dato ingresado hasta el último.");
        System.out.println("Considerando esto, dame la cantidad de ingresos que registrarás:");
        x=sc.nextInt();
        x+=icopia;
        while(i<x) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("  __  __           _       _             _        ___                                     \n" +
                    " |  \\/  | ___   __| |_   _| | ___     __| | ___  |_ _|_ __   __ _ _ __ ___  ___  ___  ___ \n" +
                    " | |\\/| |/ _ \\ / _` | | | | |/ _ \\   / _` |/ _ \\  | || '_ \\ / _` | '__/ _ \\/ __|/ _ \\/ __|\n" +
                    " | |  | | (_) | (_| | |_| | | (_) | | (_| |  __/  | || | | | (_| | | |  __/\\__ \\ (_) \\__ \\\n" +
                    " |_|  |_|\\___/ \\__,_|\\__,_|_|\\___/   \\__,_|\\___| |___|_| |_|\\__, |_|  \\___||___/\\___/|___/\n" +
                    "                                                            |___/                         ");
            System.out.println("Ingreso No."+contador);
            verificacionmesin();
            cmesdiain[i][0]=mesdiain[i][0];
            verificaciondiain();
            cmesdiain[i][1]=mesdiain[i][1];
            System.out.print("Dame el concepto del ingreso: ");
            Scanner st=new Scanner(System.in);
            conceptoin[i] = st.nextLine();
            System.out.print("Dame el monto del ingreso: ");
            ingresos[i] = sc.nextFloat();
            i++;
            contador++;
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void inegresos(){
        contador=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        jcopia=j;
        System.out.println("  ____  _                           _     _               _                       _       _             _        ______                              \n" +
                " |  _ \\(_)                         (_)   | |             | |                     | |     | |           | |      |  ____|                             \n" +
                " | |_) |_  ___ _ ____   _____ _ __  _  __| | ___     __ _| |  _ __ ___   ___   __| |_   _| | ___     __| | ___  | |__   __ _ _ __ ___  ___  ___  ___ \n" +
                " |  _ <| |/ _ \\ '_ \\ \\ / / _ \\ '_ \\| |/ _` |/ _ \\   / _` | | | '_ ` _ \\ / _ \\ / _` | | | | |/ _ \\   / _` |/ _ \\ |  __| / _` | '__/ _ \\/ __|/ _ \\/ __|\n" +
                " | |_) | |  __/ | | \\ V /  __/ | | | | (_| | (_) | | (_| | | | | | | | | (_) | (_| | |_| | | (_) | | (_| |  __/ | |___| (_| | | |  __/\\__ \\ (_) \\__ \\\n" +
                " |____/|_|\\___|_| |_|\\_/ \\___|_| |_|_|\\__,_|\\___/   \\__,_|_| |_| |_| |_|\\___/ \\__,_|\\__,_|_|\\___/   \\__,_|\\___| |______\\__, |_|  \\___||___/\\___/|___/\n" +
                "                                                                                                                        __/ |                        \n" +
                "                                                                                                                       |___/                         ");
        System.out.println("Ingresa los siguientes datos en valores enteros, tomando en cuenta las siguientes instrucciones.");
        System.out.println("-El día no puede ser mayor a 31 días con respecto al mes de egreso.");
        System.out.println("-Montos no negativos.");
        System.out.println("Nota: Te recordamos que cada vez que egresas datos en este modulo, tu modulo de resumen cambia e inicia desde el primer nuevo dato ingresado hasta el último.");
        System.out.println("Considerando esto, dame la cantidad de egresos que registrarás:");
        x=sc.nextInt();
        x+=jcopia;
        while(j<x) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("  __  __           _       _             _        _____                              \n" +
                    " |  \\/  | ___   __| |_   _| | ___     __| | ___  | ____|__ _ _ __ ___  ___  ___  ___ \n" +
                    " | |\\/| |/ _ \\ / _` | | | | |/ _ \\   / _` |/ _ \\ |  _| / _` | '__/ _ \\/ __|/ _ \\/ __|\n" +
                    " | |  | | (_) | (_| | |_| | | (_) | | (_| |  __/ | |__| (_| | | |  __/\\__ \\ (_) \\__ \\\n" +
                    " |_|  |_|\\___/ \\__,_|\\__,_|_|\\___/   \\__,_|\\___| |_____\\__, |_|  \\___||___/\\___/|___/\n" +
                    "                                                       |___/                         ");
            System.out.println("Egreso No."+contador);
            verificacionmeseg();
            cmesdiaeg[j][0]=mesdiaeg[j][0];
            verificaciondiaeg();
            cmesdiaeg[j][1]=mesdiaeg[j][1];
            System.out.print("Dame el concepto del egreso: ");
            Scanner st=new Scanner(System.in);
            conceptoeg[j]=st.nextLine();
            System.out.print("Dame el monto del egreso: ");
            egresos[j] = sc.nextFloat();
            j++;
            contador++;
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    public static void resingresos(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("  ____                       _             _        _                                     \n" +
                " |  _ \\ ___ _ __   ___  _ __| |_ ___    __| | ___  (_)_ __   __ _ _ __ ___  ___  ___  ___ \n" +
                " | |_) / _ \\ '_ \\ / _ \\| '__| __/ _ \\  / _` |/ _ \\ | | '_ \\ / _` | '__/ _ \\/ __|/ _ \\/ __|\n" +
                " |  _ <  __/ |_) | (_) | |  | ||  __/ | (_| |  __/ | | | | | (_| | | |  __/\\__ \\ (_) \\__ \\\n" +
                " |_| \\_\\___| .__/ \\___/|_|   \\__\\___|  \\__,_|\\___| |_|_| |_|\\__, |_|  \\___||___/\\___/|___/\n" +
                "           |_|                                              |___/                         ");
        System.out.println("Bienvenido a tu modulo de resumen de ingresos, aquí podrás ver cuales son los ingresos que has registrado al sistema desde tu última vez en el módulo de ingresos.");
        System.out.println("Por favor, escribe SI para avanzar y NO para salir.");
        respuestasi= sc.next();
        for(int b=icopia; b<i-1; b++){ //bubble sort desde icopia hasta i, haciendo que se actualice cada que se ingresan nuevos datos
            for(int c=icopia; c<i-1; c++){
                if(cmesdiain[c][0]>cmesdiain[c+1][0] || cmesdiain[c][0]==cmesdiain[c+1][0] && cmesdiain[c][1]>cmesdiain[c+1][1]){ //cual es mayor y menor
                    int []temp=cmesdiain[c]; //x=a copio para no perder el valor
                    cmesdiain[c]=cmesdiain[c+1]; //a=b cambio de posiciones
                    cmesdiain[c+1]=temp;//b=x ingreso el valor copiado
                }
            }
        }
        /*for(int b=icopia; b<i; b++){ //sirve para ver si se ordenaron bien
            System.out.println("["+cmesdiain[b][0]+", "+cmesdiain[b][1]+"]");
        }*/
        int cuentacuantas=0;
        if(icopia!=0) { //para que no se salga a indice -1;
            cmesdiain[icopia - 1][0] = 0;
            cmesdiain[icopia - 1][1] = 0;
        }
        for(int b=icopia; b<i; b++){ //copia nuestros nuevos valores;
            int aux=0;
            if(b!=0) {
                if (cmesdiain[b][0] == cmesdiain[b - 1][0] && cmesdiain[b][1] == cmesdiain[b - 1][1]) {
                    cuentacuantas++;
                } else cuentacuantas = 0;
            }
            for(int c=icopia; c<i; c++){
                if(cmesdiain[b][0]==mesdiain[c][0] && cmesdiain[b][1]==mesdiain[c][1] && aux==cuentacuantas){
                    cconceptoin[b]=conceptoin[c];
                    cingresos[b]=ingresos[c];
                    break;
                }
                if(cmesdiain[b][0]==mesdiain[c][0] && cmesdiain[b][1]==mesdiain[c][1]){
                    aux++;
                }
            }
        }
        /*for(int b=icopia; b<i; b++){ //sirve para ver si se imprimen bien
            System.out.println("Ordenados sin perder datos: ");
            System.out.println("Mes: "+cmesdiain[b][0]+", día: "+cmesdiain[b][1]+", concepto: "+cconceptoin[b]+", monto: "+cingresos[b]);
        }*/
        if(respuestasi.equalsIgnoreCase("SI")) {
            System.out.println("  ____  _           _      __  __                 _     ____                      _            _               _     __  __             _        \n" +
                    " |  _ \\(_) __ _    | |    |  \\/  | ___  ___      | |   |  _ \\  ___  ___  ___ _ __(_)_ __   ___(_) ___  _ __   | |   |  \\/  | ___  _ __ | |_ ___  \n" +
                    " | | | | |/ _` |   | |    | |\\/| |/ _ \\/ __|     | |   | | | |/ _ \\/ __|/ __| '__| | '_ \\ / __| |/ _ \\| '_ \\  | |   | |\\/| |/ _ \\| '_ \\| __/ _ \\ \n" +
                    " | |_| | | (_| |   | |    | |  | |  __/\\__ \\     | |   | |_| |  __/\\__ \\ (__| |  | | |_) | (__| | (_) | | | | | |   | |  | | (_) | | | | || (_) |\n" +
                    " |____/|_|\\__,_|   | |    |_|  |_|\\___||___/     | |   |____/ \\___||___/\\___|_|  |_| .__/ \\___|_|\\___/|_| |_| | |   |_|  |_|\\___/|_| |_|\\__\\___/ \n" +
                    "                   |_|                           |_|                               |_|                        |_|                                ");
            for (int b = icopia; b < i; b++) {
                System.out.println("|------------------" + " | " + "---------------------------" + " | " + "----------------------------------------------------------" + " | " + "---------------------------------|");
                System.out.println("|                  " + " | " + "                           " + " | " + "                                                          " + " | " + "                                 |");
                System.out.print("|");
                for (int c = 0; c < 4; c++) {
                    int espacios = 1;
                    int tamano = 0;
                    switch (c) {
                        case 0:
                            tamano = 18;
                            tamano -= String.valueOf(cmesdiain[b][1]).length();
                            if (tamano % 2 != 0) espacios = 0;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(cmesdiain[b][1]);
                            espacios = 1;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(" | ");
                            break;
                        case 1:
                            tamano = 27;
                            tamano -= String.valueOf(meses[cmesdiain[b][0] - 1]).length();
                            if (tamano % 2 != 0) espacios = 0;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(meses[cmesdiain[b][0] - 1]);
                            espacios = 1;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(" | ");
                            break;
                        case 2:
                            tamano = 58;
                            tamano -= cconceptoin[b].length();
                            if (tamano % 2 != 0) espacios = 0;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(cconceptoin[b]);
                            espacios = 1;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(" | ");
                            break;
                        case 3:
                            tamano = 33;
                            tamano -= String.valueOf(cingresos[b]).length();
                            if (tamano % 2 != 0) espacios = 0;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(cingresos[b]);
                            espacios = 1;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            //System.out.print("|");
                            break;
                    }
                }
                System.out.println("|");
                System.out.println("|                  " + " | " + "                           " + " | " + "                                                          " + " | " + "                                 |");
                System.out.println("|------------------" + " | " + "---------------------------" + " | " + "----------------------------------------------------------" + " | " + "---------------------------------|");
            }

            System.out.println();
            int tamano = 18;
            for (int b = icopia; b < i; b++) {
                suma += ingresos[b];
            }
            tamano -= String.valueOf(suma).length();

            System.out.print("  _____     _        _          \n" +
                    " |_   _|__ | |_ __ _| |  _    --------------------\n" +
                    "   | |/ _ \\| __/ _` | | (_)   |                  |\n" +
                    "   | | (_) | || (_| | |  _    |");
            int espacios = 1;
            if (tamano % 2 != 0) espacios = 0;
            while (espacios <= tamano / 2) {
                System.out.print(" ");
                espacios++;
            }
            System.out.print(suma);
            espacios = 1;
            while (espacios <= tamano / 2) {
                System.out.print(" ");
                espacios++;
            }
            System.out.print("|\n");
            System.out.print("   |_|\\___/ \\__\\__,_|_| (_)   |                  |\n" +
                    "                              --------------------");
            System.out.println("\n");
            System.out.print("Has terminado de leer?, indica Si o No: ");
            respuestasi = sc.next();
            while (!respuestasi.equalsIgnoreCase("SI")) {
                System.out.print("Indícanos cuando hayas terminado con un SI: ");
                respuestasi = sc.next();
            }
        }
    }
    public static void resegresos(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        Scanner sc=new Scanner(System.in);
        System.out.println("  ____                       _             _                                           \n" +
                " |  _ \\ ___ _ __   ___  _ __| |_ ___    __| | ___    ___  __ _ _ __ ___  ___  ___  ___ \n" +
                " | |_) / _ \\ '_ \\ / _ \\| '__| __/ _ \\  / _` |/ _ \\  / _ \\/ _` | '__/ _ \\/ __|/ _ \\/ __|\n" +
                " |  _ <  __/ |_) | (_) | |  | ||  __/ | (_| |  __/ |  __/ (_| | | |  __/\\__ \\ (_) \\__ \\\n" +
                " |_| \\_\\___| .__/ \\___/|_|   \\__\\___|  \\__,_|\\___|  \\___|\\__, |_|  \\___||___/\\___/|___/\n" +
                "           |_|                                           |___/                         ");
        System.out.println("Bienvenido a tu modulo de resumen de egresos, aquí podrás ver cuales son los egresos que has registrado al sistema desde tu última vez en el módulo de egresos.");
        System.out.println("Por favor, escribe SI para avanzar y NO para salir.");
        respuestasi= sc.next();
        for(int b=jcopia; b<j-1; b++){ //bubble sort desde jcopia hasta j, haciendo que se actualice cada que se ingresan nuevos datos
            for(int c=jcopia; c<j-1; c++){
                if(cmesdiaeg[c][0]>cmesdiaeg[c+1][0] || cmesdiaeg[c][0]==cmesdiaeg[c+1][0] && cmesdiaeg[c][1]>cmesdiaeg[c+1][1]){
                    int []bua=cmesdiaeg[c];
                    cmesdiaeg[c]=cmesdiaeg[c+1];
                    cmesdiaeg[c+1]=bua;
                }
            }
        }
        /*for(int b=icopia; b<i; b++){ //sirve para ver si se ordenaron bien
            System.out.println("["+cmesdiain[b][0]+", "+cmesdiain[b][1]+"]");
        }*/
        int cuentacuantas=0;
        if(jcopia!=0) {
            cmesdiaeg[jcopia - 1][0] = 0;
            cmesdiaeg[jcopia - 1][1] = 0;
        }
        for(int b=jcopia; b<j; b++){ //copia nuestros nuevos valores;
            int aux=0;
            if(b!=0) {
                if (cmesdiaeg[b][0] == cmesdiaeg[b - 1][0] && cmesdiaeg[b][1] == cmesdiaeg[b - 1][1]) {
                    cuentacuantas++;
                } else cuentacuantas = 0;
            }
            for(int c=jcopia; c<j; c++){
                if(cmesdiaeg[b][0]==mesdiaeg[c][0] && cmesdiaeg[b][1]==mesdiaeg[c][1] && aux==cuentacuantas){
                    cconceptoeg[b]=conceptoeg[c];
                    cegresos[b]=egresos[c];
                    break;
                }
                if(cmesdiaeg[b][0]==mesdiaeg[c][0] && cmesdiaeg[b][1]==mesdiaeg[c][1]){
                    aux++;
                }
            }
        }
        /*for(int b=jcopia; b<i; b++){ //sirve para ver si se imprimen bien
            System.out.println("Ordenados sin perder datos: ");
            System.out.println("Mes: "+cmesdiaeg[b][0]+", día: "+cmesdiaeg[b][1]+", concepto: "+cconceptoeg[b]+", monto: "+cegresos[b]);
        }*/
        if(respuestasi.equalsIgnoreCase("SI")) {
            System.out.println("  ____  _           _      __  __                 _     ____                      _            _               _     __  __             _        \n" +
                    " |  _ \\(_) __ _    | |    |  \\/  | ___  ___      | |   |  _ \\  ___  ___  ___ _ __(_)_ __   ___(_) ___  _ __   | |   |  \\/  | ___  _ __ | |_ ___  \n" +
                    " | | | | |/ _` |   | |    | |\\/| |/ _ \\/ __|     | |   | | | |/ _ \\/ __|/ __| '__| | '_ \\ / __| |/ _ \\| '_ \\  | |   | |\\/| |/ _ \\| '_ \\| __/ _ \\ \n" +
                    " | |_| | | (_| |   | |    | |  | |  __/\\__ \\     | |   | |_| |  __/\\__ \\ (__| |  | | |_) | (__| | (_) | | | | | |   | |  | | (_) | | | | || (_) |\n" +
                    " |____/|_|\\__,_|   | |    |_|  |_|\\___||___/     | |   |____/ \\___||___/\\___|_|  |_| .__/ \\___|_|\\___/|_| |_| | |   |_|  |_|\\___/|_| |_|\\__\\___/ \n" +
                    "                   |_|                           |_|                               |_|                        |_|                                ");
            for (int b = jcopia; b < j; b++) {
                System.out.println("|------------------" + " | " + "---------------------------" + " | " + "----------------------------------------------------------" + " | " + "---------------------------------|");
                System.out.println("|                  " + " | " + "                           " + " | " + "                                                          " + " | " + "                                 |");
                System.out.print("|");
                for (int c = 0; c < 4; c++) {
                    int espacios = 1;
                    int tamano = 0;
                    switch (c) {
                        case 0:
                            tamano = 18;
                            tamano -= String.valueOf(cmesdiaeg[b][1]).length();
                            if (tamano % 2 != 0) espacios = 0;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(cmesdiaeg[b][1]);
                            espacios = 1;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(" | ");
                            break;
                        case 1:
                            tamano = 27;
                            tamano -= String.valueOf(meses[cmesdiaeg[b][0] - 1]).length();
                            if (tamano % 2 != 0) espacios = 0;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(meses[cmesdiaeg[b][0] - 1]);
                            espacios = 1;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(" | ");
                            break;
                        case 2:
                            tamano = 58;
                            tamano -= cconceptoeg[b].length();
                            if (tamano % 2 != 0) espacios = 0;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(cconceptoeg[b]);
                            espacios = 1;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(" | ");
                            break;
                        case 3:
                            tamano = 33;
                            tamano -= String.valueOf(cegresos[b]).length();
                            if (tamano % 2 != 0) espacios = 0;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            System.out.print(cegresos[b]);
                            espacios = 1;
                            while (espacios <= tamano / 2) {
                                System.out.print(" ");
                                espacios++;
                            }
                            //System.out.print("|");
                            break;
                    }
                }
                System.out.println("|");
                System.out.println("|                  " + " | " + "                           " + " | " + "                                                          " + " | " + "                                 |");
                System.out.println("|------------------" + " | " + "---------------------------" + " | " + "----------------------------------------------------------" + " | " + "---------------------------------|");
            }

            System.out.println();
            int tamano = 18;
            for (int b = jcopia; b < j; b++) {
                suma += egresos[b];
            }
            tamano -= String.valueOf(suma).length();

            System.out.print("  _____     _        _          \n" +
                    " |_   _|__ | |_ __ _| |  _    --------------------\n" +
                    "   | |/ _ \\| __/ _` | | (_)   |                  |\n" +
                    "   | | (_) | || (_| | |  _    |");
            int espacios = 1;
            if (tamano % 2 != 0) espacios = 0;
            while (espacios <= tamano / 2) {
                System.out.print(" ");
                espacios++;
            }
            System.out.print(suma);
            espacios = 1;
            while (espacios <= tamano / 2) {
                System.out.print(" ");
                espacios++;
            }
            System.out.print("|\n");
            System.out.print("   |_|\\___/ \\__\\__,_|_| (_)   |                  |\n" +
                    "                              --------------------");
            System.out.println("\n");
            System.out.print("Has terminado de leer?, indica Si o No: ");
            respuestasi = sc.next();
            while (!respuestasi.equalsIgnoreCase("SI")) {
                System.out.print("Indícanos cuando hayas terminado con un SI: ");
                respuestasi = sc.next();
            }
        }
    }
    public static void primerm(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("  __  __           _      _             _           _    _                            ____   ___    _______  ___    ______   ___  \n" +
                " |  \\/  | ___   __| | ___| | ___     __| | ___     / \\  | |__   ___  _ __ _ __ ___   | ___| / _ \\  / /___ / / _ \\  / /___ \\ / _ \\ \n" +
                " | |\\/| |/ _ \\ / _` |/ _ \\ |/ _ \\   / _` |/ _ \\   / _ \\ | '_ \\ / _ \\| '__| '__/ _ \\  |___ \\| | | |/ /  |_ \\| | | |/ /  __) | | | |\n" +
                " | |  | | (_) | (_| |  __/ | (_) | | (_| |  __/  / ___ \\| | | | (_) | |  | | | (_) |  ___) | |_| / /  ___) | |_| / /  / __/| |_| |\n" +
                " |_|  |_|\\___/ \\__,_|\\___|_|\\___/   \\__,_|\\___| /_/   \\_\\_| |_|\\___/|_|  |_|  \\___/  |____/ \\___/_/  |____/ \\___/_/  |_____|\\___/ \n" +
                "                                                                                                                                  ");
        Scanner sc=new Scanner(System.in);
        for(int a=icopia; a<i; a++){
            suma+=ingresos[a];
        }
        if(i==0) suma=0;
        else suma/=i;
        if(ingresado) suma=sumai;
        System.out.println("Haciendo un promedio de los datos que tenemos, tu ingreso general es, según los datos que has registrado en el módulo de ingresos o en el modulo de perfil: "+suma);
        System.out.println("Es correcto o quieres actualizarlo?     1.- Quiero cambiarlo    2.- Es correcto.");
        op1=sc.nextInt();
        while(op1<1 || op1>2){
            System.out.println("Opción incorrecta, por favor ingresa una opción válida.");
            op1=sc.nextInt();
        }
        if(op1==1){
            System.out.println("Por favor selecciona tu ingreso mensual, recuerda que debe ser un número entero positivo: ");
            sumai=sc.nextFloat();
            while(sumai<0){
                System.out.println("Dato inválido, por favor ingresa un número válido.");
                sumai=sc.nextFloat();
            }
            ingresado=true;
            suma=sumai;
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("  __  __           _      _         ____   ___    _______  ___    ______   ___  \n" +
                " |  \\/  | ___   __| | ___| | ___   | ___| / _ \\  / /___ / / _ \\  / /___ \\ / _ \\ \n" +
                " | |\\/| |/ _ \\ / _` |/ _ \\ |/ _ \\  |___ \\| | | |/ /  |_ \\| | | |/ /  __) | | | |\n" +
                " | |  | | (_) | (_| |  __/ | (_) |  ___) | |_| / /  ___) | |_| / /  / __/| |_| |\n" +
                " |_|  |_|\\___/ \\__,_|\\___|_|\\___/  |____/ \\___/_/  |____/ \\___/_/  |_____|\\___/ \n" +
                "                                                                                ");
        System.out.println("En base al ingreso mensual o lo que nos has dado, hemos calculado para ti el siguiente modelo de ahorro: ");
        System.out.println("Necesidades (%50): "+(suma*.5));
        System.out.println("Deseos (%30): "+(suma*.3));
        System.out.println("Ahorro/Deudas (%20): "+(suma*.2));
        System.out.println("Has terminado de leer?, indica Si o No.");
        respuestasi=sc.next();
        while(!respuestasi.equalsIgnoreCase("SI")){
            System.out.print("Indicanos cuando hayas terminado con un SI: ");
            respuestasi=sc.next();
        }
    }
    public static void segundom(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("  __  __           _      _             _           _    _                                    _                            ____  _                \n" +
                " |  \\/  | ___   __| | ___| | ___     __| | ___     / \\  | |__   ___  _ __ _ __ ___     __ _  | |    __ _ _ __ __ _  ___   |  _ \\| | __ _ _______  \n" +
                " | |\\/| |/ _ \\ / _` |/ _ \\ |/ _ \\   / _` |/ _ \\   / _ \\ | '_ \\ / _ \\| '__| '__/ _ \\   / _` | | |   / _` | '__/ _` |/ _ \\  | |_) | |/ _` |_  / _ \\ \n" +
                " | |  | | (_) | (_| |  __/ | (_) | | (_| |  __/  / ___ \\| | | | (_) | |  | | | (_) | | (_| | | |__| (_| | | | (_| | (_) | |  __/| | (_| |/ / (_) |\n" +
                " |_|  |_|\\___/ \\__,_|\\___|_|\\___/   \\__,_|\\___| /_/   \\_\\_| |_|\\___/|_|  |_|  \\___/   \\__,_| |_____\\__,_|_|  \\__, |\\___/  |_|   |_|\\__,_/___\\___/ \n" +
                "                                                                                                             |___/                                ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Nota: Recuerda que este modelo de ahorro considera metas de ahorro con un plazo mayor a 5 años.");
        System.out.println("¿Quieres continuar?, responde SI o NO.");
        respuestasi=sc.next();
        while(!respuestasi.equalsIgnoreCase("SI")){
            System.out.println("Esa respuesta no es aceptada, por favor, escribe SI o NO");
            respuestasi=sc.next();
        }
        if(!respuestasi.equalsIgnoreCase("NO")){
            System.out.print("\n");
            System.out.print("Dame el concepto de la meta que quieres crear: ");
            Scanner st=new Scanner(System.in);
            meta=st.nextLine();
            for(int a=icopia; a<i; a++){
                suma+=ingresos[a];
            }
            if(i==0) suma=0;
            else suma/=i;
            if(ingresado) suma=sumai;
            System.out.println("Haciendo un promedio de los datos que tenemos, tu ingreso general es, según los datos que has registrado en el módulo de ingresos o en el modulo de perfil: "+suma);
            System.out.println("Es correcto o quieres actualizarlo?     1.- Quiero cambiarlo    2.- Es correcto.");
            op1=sc.nextInt();
            while(op1<1 || op1>2){
                System.out.println("Opción incorrecta, por favor ingresa una opción válida.");
                op1=sc.nextInt();
            }
            if(op1==1){
                System.out.print("Por favor selecciona tu ingreso mensual, recuerda que debe ser un número entero positivo: ");
                sumai=sc.nextFloat();
                while(sumai<0){
                    System.out.print("Dato inválido, por favor ingresa un número válido.");
                    sumai=sc.nextFloat();
                }
                ingresado=true;
                suma=sumai;
            }
            System.out.print("Cúal es el valor monetario de tu meta objetivo? ");
            valorx=sc.nextFloat();
            while(valorx<=0){
                System.out.print("Ingresa un valor mayor a 0 para tu meta objetivo: ");
                valorx=sc.nextFloat();
            }

            System.out.print("En cuantos años planeas alcanzarla? (entero positivo): ");
            valora=sc.nextInt();
            while(valora<5){
                System.out.println("Recuerda que este modulo es a largo plazo! (más de 5 años). ");
                System.out.print("Ingresa un valor en años que concuerde con esto: ");
                valora=sc.nextInt();
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("  __  __           _      _             _           _    _                                    _                            ____  _                \n" +
                    " |  \\/  | ___   __| | ___| | ___     __| | ___     / \\  | |__   ___  _ __ _ __ ___     __ _  | |    __ _ _ __ __ _  ___   |  _ \\| | __ _ _______  \n" +
                    " | |\\/| |/ _ \\ / _` |/ _ \\ |/ _ \\   / _` |/ _ \\   / _ \\ | '_ \\ / _ \\| '__| '__/ _ \\   / _` | | |   / _` | '__/ _` |/ _ \\  | |_) | |/ _` |_  / _ \\ \n" +
                    " | |  | | (_) | (_| |  __/ | (_) | | (_| |  __/  / ___ \\| | | | (_) | |  | | | (_) | | (_| | | |__| (_| | | | (_| | (_) | |  __/| | (_| |/ / (_) |\n" +
                    " |_|  |_|\\___/ \\__,_|\\___|_|\\___/   \\__,_|\\___| /_/   \\_\\_| |_|\\___/|_|  |_|  \\___/   \\__,_| |_____\\__,_|_|  \\__, |\\___/  |_|   |_|\\__,_/___\\___/ \n" +
                    "                                                                                                             |___/                                ");
            System.out.println("ESTRATEGIA RECOMENDADA");
            System.out.println("----------------------------------------------");
            System.out.println("Basado en tu meta actual ("+meta+") de $ "+ valorx+ " a "+valora+ " años.");
            System.out.println("-Aporte Mensual necesario desde ahora: "+ valorx/(valora*12));
            System.out.println("----------------------------------------------");
            if(suma==0){
                percentage=100;
            }else {
                percentage = (valorx/(valora*12)*100)/suma;
            }
            System.out.println("Tu aporte mensual representa un "+percentage+"% sobre tu sueldo mensual.");
            if(percentage>=50){
                System.out.println("Consideramos que, dado que supera en "+percentage+"% tu sueldo mensual, no es una meta viable.");
            }

            System.out.println("Has terminado de leer?, indica Si o No.");
            respuestasi=sc.next();
            while(!respuestasi.equalsIgnoreCase("SI")){
                System.out.print("Indicanos cuando hayas terminado con un SI: ");
                respuestasi=sc.next();
            }
        }
    }//fin modulo largo plazo
    public static void tercerm(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("  __  __           _      _             _           _    _                                    __  __          _ _                     ____  _                \n" +
                " |  \\/  | ___   __| | ___| | ___     __| | ___     / \\  | |__   ___  _ __ _ __ ___     __ _  |  \\/  | ___  __| (_) __ _ _ __   ___   |  _ \\| | __ _ _______  \n" +
                " | |\\/| |/ _ \\ / _` |/ _ \\ |/ _ \\   / _` |/ _ \\   / _ \\ | '_ \\ / _ \\| '__| '__/ _ \\   / _` | | |\\/| |/ _ \\/ _` | |/ _` | '_ \\ / _ \\  | |_) | |/ _` |_  / _ \\ \n" +
                " | |  | | (_) | (_| |  __/ | (_) | | (_| |  __/  / ___ \\| | | | (_) | |  | | | (_) | | (_| | | |  | |  __/ (_| | | (_| | | | | (_) | |  __/| | (_| |/ / (_) |\n" +
                " |_|  |_|\\___/ \\__,_|\\___|_|\\___/   \\__,_|\\___| /_/   \\_\\_| |_|\\___/|_|  |_|  \\___/   \\__,_| |_|  |_|\\___|\\__,_|_|\\__,_|_| |_|\\___/  |_|   |_|\\__,_/___\\___/ \n" +
                "                                                                                                                                                             ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Nota: Recuerda que este modelo de ahorro considera metas de ahorro con un plazo mayor o igual a 1 año y menor o igual a 5 años.");
        System.out.println("¿Quieres continuar?, responde SI o NO.");
        respuestasi=sc.next();
        while(!respuestasi.equalsIgnoreCase("SI")){
            System.out.println("Esa respuesta no es aceptada, por favor, escribe SI o NO");
            respuestasi=sc.next();
        }
        if(!respuestasi.equalsIgnoreCase("NO")){
            System.out.print("\n");
            System.out.print("Dame el concepto de la meta que quieres crear: ");
            Scanner st=new Scanner(System.in);
            meta=st.nextLine();
            for(int a=icopia; a<i; a++){
                suma+=ingresos[a];
            }
            if(i==0) suma=0;
            else suma/=i;
            if(ingresado) suma=sumai;
            System.out.println("Haciendo un promedio de los datos que tenemos, tu ingreso general es, según los datos que has registrado en el módulo de ingresos o en el modulo de perfil: "+suma);
            System.out.println("Es correcto o quieres actualizarlo?     1.- Quiero cambiarlo    2.- Es correcto.");
            op1=sc.nextInt();
            while(op1<1 || op1>2){
                System.out.println("Opción incorrecta, por favor ingresa una opción válida.");
                op1=sc.nextInt();
            }
            if(op1==1){
                System.out.print("Por favor selecciona tu ingreso mensual, recuerda que debe ser un número entero positivo: ");
                sumai=sc.nextFloat();
                while(sumai<0){
                    System.out.print("Dato inválido, por favor ingresa un número válido.");
                    sumai=sc.nextFloat();
                }
                suma=sumai;
                ingresado=true;
            }
            System.out.print("Cúal es el valor monetario de tu meta objetivo? ");
            valorx=sc.nextFloat();
            while(valorx<=0){
                System.out.print("Ingresa un valor mayor a 0 para tu meta objetivo: ");
                valorx=sc.nextFloat();
            }

            System.out.print("En cuantos años planeas alcanzarla? (entero positivo): ");
            valora=sc.nextInt();
            while(!(valora>=1 && valora<=5)){
                System.out.println("Recuerda que este modulo es a mediano plazo! (1-5 años). ");
                System.out.print("Ingresa un valor en años que concuerde con esto: ");
                valora=sc.nextInt();
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("  __  __           _      _             _           _    _                                    __  __          _ _                     ____  _                \n" +
                    " |  \\/  | ___   __| | ___| | ___     __| | ___     / \\  | |__   ___  _ __ _ __ ___     __ _  |  \\/  | ___  __| (_) __ _ _ __   ___   |  _ \\| | __ _ _______  \n" +
                    " | |\\/| |/ _ \\ / _` |/ _ \\ |/ _ \\   / _` |/ _ \\   / _ \\ | '_ \\ / _ \\| '__| '__/ _ \\   / _` | | |\\/| |/ _ \\/ _` | |/ _` | '_ \\ / _ \\  | |_) | |/ _` |_  / _ \\ \n" +
                    " | |  | | (_) | (_| |  __/ | (_) | | (_| |  __/  / ___ \\| | | | (_) | |  | | | (_) | | (_| | | |  | |  __/ (_| | | (_| | | | | (_) | |  __/| | (_| |/ / (_) |\n" +
                    " |_|  |_|\\___/ \\__,_|\\___|_|\\___/   \\__,_|\\___| /_/   \\_\\_| |_|\\___/|_|  |_|  \\___/   \\__,_| |_|  |_|\\___|\\__,_|_|\\__,_|_| |_|\\___/  |_|   |_|\\__,_/___\\___/ \n" +
                    "                                                                                                                                                             ");
            System.out.println("ESTRATEGIA RECOMENDADA");
            System.out.println("----------------------------------------------");
            System.out.println("Basado en tu meta actual ("+meta+") de $ "+ valorx+ " a "+valora+ " años.");
            System.out.println("-Aporte Mensual necesario desde ahora: "+ (double)valorx/(valora*12));
            System.out.println("----------------------------------------------");
            if(suma==0){
                percentage=100;
            }else {
                percentage = (valorx/(valora*12)*100)/suma;
            }
            System.out.println("Tu aporte mensual representa un "+percentage+"% sobre tu sueldo mensual.");
            if(percentage>=50){
                System.out.println("Consideramos que, dado que supera en "+percentage+"% tu sueldo mensual, no es una meta viable.");
            }

            System.out.println("Has terminado de leer?, indica Si o No.");
            respuestasi=sc.next();
            while(!respuestasi.equalsIgnoreCase("SI")){
                System.out.print("Indicanos cuando hayas terminado con un SI: ");
                respuestasi=sc.next();
            }
        }
    }//fin modelo mediano plazo
    public static void cuartom(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("  __  __           _      _             _           _    _                                     ____           _          ____  _                \n" +
                " |  \\/  | ___   __| | ___| | ___     __| | ___     / \\  | |__   ___  _ __ _ __ ___     __ _   / ___|___  _ __| |_ ___   |  _ \\| | __ _ _______  \n" +
                " | |\\/| |/ _ \\ / _` |/ _ \\ |/ _ \\   / _` |/ _ \\   / _ \\ | '_ \\ / _ \\| '__| '__/ _ \\   / _` | | |   / _ \\| '__| __/ _ \\  | |_) | |/ _` |_  / _ \\ \n" +
                " | |  | | (_) | (_| |  __/ | (_) | | (_| |  __/  / ___ \\| | | | (_) | |  | | | (_) | | (_| | | |__| (_) | |  | || (_) | |  __/| | (_| |/ / (_) |\n" +
                " |_|  |_|\\___/ \\__,_|\\___|_|\\___/   \\__,_|\\___| /_/   \\_\\_| |_|\\___/|_|  |_|  \\___/   \\__,_|  \\____\\___/|_|   \\__\\___/  |_|   |_|\\__,_/___\\___/ \n" +
                "                                                                                                                                                ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Nota: Recuerda que este modelo de ahorro considera metas de ahorro con un plazo no mayor a 12 meses");
        System.out.println("¿Quieres continuar?, responde SI o NO.");
        respuestasi=sc.next();
        while(!respuestasi.equalsIgnoreCase("SI")){
            System.out.println("Esa respuesta no es aceptada, por favor, escribe SI o NO");
            respuestasi=sc.next();
        }
        if(!respuestasi.equalsIgnoreCase("NO")){
            System.out.print("\n");
            System.out.print("Dame el concepto de la meta que quieres crear: ");
            Scanner st=new Scanner(System.in);
            meta=st.nextLine();
            for(int a=icopia; a<i; a++){
                suma+=ingresos[a];
            }
            if(i==0) suma=0;
            else suma/=i;
            if(ingresado) suma=sumai;
            System.out.println("Haciendo un promedio de los datos que tenemos, tu ingreso general es, según los datos que has registrado en el módulo de ingresos o en el modulo de perfil: "+suma);
            System.out.println("Es correcto o quieres actualizarlo?     1.- Quiero cambiarlo    2.- Es correcto.");
            op1=sc.nextInt();
            while(op1<1 || op1>2){
                System.out.println("Opción incorrecta, por favor ingresa una opción válida.");
                op1=sc.nextInt();
            }
            if(op1==1){
                System.out.print("Por favor selecciona tu ingreso mensual, recuerda que debe ser un número entero positivo: ");
                sumai=sc.nextFloat();
                while(sumai<0){
                    System.out.print("Dato inválido, por favor ingresa un número válido.");
                    sumai=sc.nextFloat();
                }
                suma=sumai;
                ingresado=true;
            }
            System.out.print("Cúal es el valor monetario de tu meta objetivo? ");
            valorx=sc.nextFloat();
            while(valorx<=0){
                System.out.print("Ingresa un valor mayor a 0 para tu meta objetivo: ");
                valorx=sc.nextFloat();
            }

            System.out.print("En cuantos meses planeas alcanzarla? (entero positivo): ");
            valora=sc.nextInt();
            while(!(valora>=1 && valora<=12)){
                System.out.println("Recuerda que este modulo es a corto plazo! (1-12 meses). ");
                System.out.print("Ingresa un valor en meses que concuerde con esto: ");
                valora=sc.nextInt();
            }
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("  __  __           _      _             _           _    _                                    __  __          _ _                     ____  _                \n" +
                    " |  \\/  | ___   __| | ___| | ___     __| | ___     / \\  | |__   ___  _ __ _ __ ___     __ _  |  \\/  | ___  __| (_) __ _ _ __   ___   |  _ \\| | __ _ _______  \n" +
                    " | |\\/| |/ _ \\ / _` |/ _ \\ |/ _ \\   / _` |/ _ \\   / _ \\ | '_ \\ / _ \\| '__| '__/ _ \\   / _` | | |\\/| |/ _ \\/ _` | |/ _` | '_ \\ / _ \\  | |_) | |/ _` |_  / _ \\ \n" +
                    " | |  | | (_) | (_| |  __/ | (_) | | (_| |  __/  / ___ \\| | | | (_) | |  | | | (_) | | (_| | | |  | |  __/ (_| | | (_| | | | | (_) | |  __/| | (_| |/ / (_) |\n" +
                    " |_|  |_|\\___/ \\__,_|\\___|_|\\___/   \\__,_|\\___| /_/   \\_\\_| |_|\\___/|_|  |_|  \\___/   \\__,_| |_|  |_|\\___|\\__,_|_|\\__,_|_| |_|\\___/  |_|   |_|\\__,_/___\\___/ \n" +
                    "                                                                                                                                                             ");
            System.out.println("ESTRATEGIA RECOMENDADA");
            System.out.println("----------------------------------------------");
            System.out.println("Basado en tu meta actual ("+meta+") de $ "+ valorx+ " a "+valora+ " meses.");
            System.out.println("-Aporte Mensual necesario desde ahora: "+ (double)valorx/(valora));
            System.out.println("----------------------------------------------");
            if(suma==0){
                percentage=100;
            }else {
                percentage= valorx/(valora)/suma;
            }
            System.out.println("Tu aporte mensual representa un "+percentage+"% sobre tu sueldo mensual.");
            if(percentage>=50){
                System.out.println("Consideramos que, dado que supera en "+percentage+"% tu sueldo mensual, no es una meta viable.");
            }

            System.out.println("Has terminado de leer?, indica Si o No.");
            respuestasi=sc.next();
            while(!respuestasi.equalsIgnoreCase("SI")){
                System.out.print("Indicanos cuando hayas terminado con un SI: ");
                respuestasi=sc.next();
            }
        }
    }// fin modelo corto plazo.
     public static void verificacionmesin(){ //nos sirve para verificar que se haya puesto un mes correcto
        Scanner sc=new Scanner(System.in);
        System.out.print("Dame el mes en el que se efectuó el ingreso: ");
        mes= sc.next();
        for(int k=0; k<12; k++){
            if(mes.equalsIgnoreCase(meses[k])){
                mesdiain[i][0]=k+1;
                break;
            }
        }
        while(mesdiain[i][0]==0){
            System.out.print("Dame un mes válido, por favor: ");
            mes= sc.next();
            for(int k=0; k<12; k++){
                if(mes.equalsIgnoreCase(meses[k])){
                    mesdiain[i][0]=k+1;
                    break;
                }
            }
        }
    }
    public static void verificaciondiain(){ //en base al mes, nos sirve para verificar que se haya puesto un día correcto.
        Scanner sc=new Scanner(System.in);
        if(mesdiain[i][0]==1 || mesdiain[i][0]==3 || mesdiain[i][0]==5 || mesdiain[i][0]==7 || mesdiain[i][0]==8 || mesdiain[i][0]==10 || mesdiain[i][0]==12){
            System.out.print("El mes que ingresaste anteriormente solo tiene 31 días, por lo que tienes que escribir un día del 1-31: ");
            mesdiain[i][1]=sc.nextInt();
            while(mesdiain[i][1]<1 || mesdiain[i][1]>31){
                System.out.print("Dame un día válido,considera el mensaje que tienes arriba: ");
                mesdiain[i][1]=sc.nextInt();
            }
        } //meses de 31 días.
        else if(mesdiain[i][0]==2){
            System.out.print("El mes que ingresaste anteriormente solo tiene 28 días, por lo que tienes que escribir un día del 1-28: ");
            mesdiain[i][1]=sc.nextInt();
            while(mesdiain[i][1]<1 || mesdiain[i][1]>28){
                System.out.print("Dame un día válido,considera el mensaje que tienes arriba: ");
                mesdiain[i][1]=sc.nextInt();
            }
        }else{
            System.out.print("El mes que ingresaste anteriormente solo tiene 30 días, por lo que tienes que escribir un día del 1-30: ");
            mesdiain[i][1]=sc.nextInt();
            while(mesdiain[i][1]<1 || mesdiain[i][1]>30){
                System.out.print("Dame un día válido,considera el mensaje que tienes arriba: ");
                mesdiain[i][1]=sc.nextInt();
            }
        }
    }
    public static void verificacionmeseg(){ //nos sirve para verificar que se haya puesto un mes correcto
        Scanner sc=new Scanner(System.in);
        while(mesdiaeg[j][0]==0){
            System.out.print("Dame el mes en el que se efectuó el egreso: ");
            mes= sc.next();
            for(int k=0; k<12; k++){
                if(mes.equalsIgnoreCase(meses[k])){
                    mesdiaeg[j][0]=k+1;
                    break;
                }
            }
        }
    }
     public static void verificaciondiaeg(){ //en base al mes, nos sirve para verificar que se haya puesto un día correcto.
        Scanner sc=new Scanner(System.in);
        if(mesdiaeg[j][0]==1 || mesdiaeg[j][0]==3 || mesdiaeg[j][0]==5 || mesdiaeg[j][0]==7 || mesdiaeg[j][0]==8 || mesdiaeg[j][0]==10 || mesdiaeg[j][0]==12){
            System.out.print("El mes que ingresaste anteriormente solo tiene 31 días, por lo que tienes que escribir un día del 1-31: ");
            mesdiaeg[j][1]=sc.nextInt();
            while(mesdiaeg[j][1]<1 || mesdiaeg[j][1]>31){
                System.out.print("Dame un día válido, considera el mensaje que tienes arriba: ");
                mesdiaeg[j][1]=sc.nextInt();
            }
        } //meses de 31 días.
        else if(mesdiaeg[j][0]==2){
            System.out.print("El mes que ingresaste anteriormente solo tiene 28 días, por lo que tienes que escribir un día del 1-28: ");
            mesdiaeg[j][1]=sc.nextInt();
            while(mesdiaeg[j][1]<1 || mesdiaeg[j][1]>28){
                System.out.print("Dame un día válido, considera el mensaje que tienes arriba: ");
                mesdiaeg[j][1]=sc.nextInt();
            }
        }else{
            System.out.print("El mes que ingresaste anteriormente solo tiene 30 días, por lo que tienes que escribir un día del 1-30: ");
            mesdiaeg[j][1]=sc.nextInt();
            while(mesdiaeg[j][1]<1 || mesdiaeg[j][1]>30){
                System.out.print("Dame un día válido,considera el mensaje que tienes arriba: ");
                mesdiaeg[j][1]=sc.nextInt();
            }
        }
    }
}
