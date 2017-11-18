package br.edu.fatecfranca.exe5;

public class Papel extends Coisa{
    
    @Override
    public String quemSouEu() {
        return "Papel";
    }
    
    @Override
    public String compara(Coisa c) {
        String aux = c.quemSouEu(); //polimorfismo
        
        switch(aux) {
            case "Papel": return "Papel empata Papel";
            case "Pedra": return "Papel ganha Pedra";
            case "Tesoura": return "Papel perde Tesoura";
            default: return "Impossivel comparar";
        }
    }
}
