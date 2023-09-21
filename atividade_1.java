class main { 
     public static void main(String[] args) { 
     Scanner ler = new Scanner(System.in); 
     System.out.println("Digite a Idade: "); 
     int idade = ler.nextInt(); 
        if(idade >=60){ 
     System.out.println("Idosa"); 
     }  else if (idade >= 18){ 
     System.out.println("Adulta"); 
     }  else{ 
     System.out.println("Crianca"); 
     } 
     
     } 
    } 