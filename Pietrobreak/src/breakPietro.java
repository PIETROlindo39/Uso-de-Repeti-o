public class breakPietro {
    public static void main(String[] args){
        double valorCarro = 30000;
        for(int i = 1; i <= valorCarro; i++){
            double valorPacela = valorCarro / i;
            if(valorPacela > 1000){
                System.out.println("Parcela "+i+" R$ "+valorPacela);
            }else{
              break;
            }
        }
    }
}
