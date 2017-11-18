package br.edu.fatecfranca.exe5;

public class Pedra extends Coisa {
    
    @Override
    public String quemSouEu() {
        return "Pedra";
    }
    
    @Override
    public String compara(Coisa c) {
        String aux = c.quemSouEu(); //polimorfismo
        
        switch(aux) {
            case "Pedra": return "Pedra empata Pedra";
            case "Papel": return "Pedra perde Papel";
            case "Tesoura": return "Pedra ganha Tesoura";
            default: return "Impossivel comparar";
        }
    };
}
