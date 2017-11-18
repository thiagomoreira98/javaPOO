package br.edu.fatecfranca.exe5;

public class Tesoura extends Coisa {
    
    @Override
    public String quemSouEu() {
        return "Tesoura";
    }
    
    @Override
    public String compara(Coisa c) {
        String aux = c.quemSouEu(); //polimorfismo
        
        switch(aux) {
            case "Tesoura": return "Tesoura empata Tesoura";
            case "Papel": return "Tesoura ganha Papel";
            case "Pedra": return "Tesoura perde Pedra";
            default: return "Impossivel comparar";
        }
    }
}
