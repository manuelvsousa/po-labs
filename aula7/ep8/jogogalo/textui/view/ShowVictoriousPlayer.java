package jogogalo.textui.view;

import pt.utl.ist.po.ui.Menu;
import pt.utl.ist.po.ui.Command;
import pt.utl.ist.po.ui.Display;

import jogogalo.core.AplicacaoJogoGalo;

/**
 * Command for showing the number of finished games.
 */
public class ShowVictoriousPlayer extends Command<AplicacaoJogoGalo> {

    /**
     * Constructor.
     *
     * @param ent the target entity.
     */
    public ShowVictoriousPlayer(AplicacaoJogoGalo app) {
        super("Obter Jogador Com Mais Vitorias", app);
    }

    public static int[] obtemAutoria() {
        int[] inteiros = {28, 84719, 84740};
        return inteiros;
    }

    /**
     * Execute the command.
     */
    @Override
    @SuppressWarnings("nls")
    public final void execute() {
        System.out.println("O Jogador Com Mais Vitórias : " + entity().obterJogadorMaisVitorioso());
    }
}