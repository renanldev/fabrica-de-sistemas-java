
//AQUI CRIAMOS O MÉTODO DESENHAR PARA OS BOTÕES, E ENTÃO QUALQUER CLASSE QUE USAR O BOTÃO 
// VAI SER OBRIGADA A IMPLEMENTAR ESSE MÉTODO
interface Botao {
    void desenhar();
}

//FIZEMOS A MESMA COISA PARA A JANELA, SÓ QUE COM O MÉTODO ABRIR
interface Janela{
    void abrir();
}


//CRIAMOS UM BOTÃO PARA WINDOWS E OUTRO PARA LINUX

//AQUI A CLASSE BOTÃO WINDOWS VAI IMPLEMENTAR O MÉTODO DESENHAR E MOSTRAR QUE É UM BOTÃO DO WINDOWS
class BotaoWindows implements Botao {
    public void desenhar() {
        System.out.println("Desenhando um botão do Windows!");
    }
}

//A MESMA COISA PARA O BOTÃO DO LINUX
class BotaoLinux implements Botao {
    public void desenhar() {
        System.out.println("Desenhando um botão do Linux!");
    }
}

//SEGUIMOS O MESMO PADRÃO PARA CRIAR AS JANELAS: CHAMA A CLASSE E IMPLEMENTA O MÉTODO ABRIR, 
//MOSTRANDO NO PRINT DE QUAL SISTEMA OPERACIONAL É A JANELA 

class JanelaWindows implements Janela {
    public void abrir() {
        System.out.println("Abrindo uma janela do Windows!");
    }
}

class JanelaLinux implements Janela {
    public void abrir() {
        System.out.println("Abrindo uma janela do Linux!");
    }
}

//AQUI É A FÁBRICA ONDE A GENTE VAI DEFINIR OS MÉTODOS PARA CRIAR BOTÕES E JANELAS
interface Fabrica {
    Botao criarBotao();
    Janela criarJanela();
}

//AGORA CRIAMOS AS FÁBRICAS DE WINDOWS E LINUX
class FabricaWindows implements Fabrica {
    public Botao criarBotao() {
        return new BotaoWindows();
    }
    public Janela criarJanela() {
        return new JanelaWindows();
    }
}

class FabricaLinux implements Fabrica {
    public Botao criarBotao() {
        return new BotaoLinux();
    }
    public Janela criarJanela() {
        return new JanelaLinux();
    }
}

//CRIAMOS O MÉTODO ESCOLHERFÁBRICA
public class Main {
    public static Fabrica escolherFabrica() {

        String sistema = System.getProperty("os.name");

        if (sistema.toLowerCase().contains("win")) {  //MUDE AQUI PARA O SISTEMA DE SUA ESCOLHA!
            return new FabricaWindows();
        } else {
            return new FabricaLinux();
        }
    }

    public static void main (String[] args) {

        Fabrica fabrica = escolherFabrica();

        Botao botao = fabrica.criarBotao();
        Janela janela = fabrica.criarJanela();

        botao.desenhar();
        janela.abrir();
    }
}

