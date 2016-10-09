package ws.upm.miw.pd.command.calculator.memento;

import es.upm.miw.pd.command.calculator.AddCommand;
import es.upm.miw.pd.command.calculator.CommandManager;
import es.upm.miw.pd.command.calculator.PrintCommand;
import es.upm.miw.pd.command.calculator.ResetCommand;
import es.upm.miw.pd.command.calculator.SubtractCommand;
import upm.jbb.IO;

public class MainCalculadoraMementable {
    private CommandManager commandManager;

    public MainCalculadoraMementable() {
        CalculadoraMementable calculator = new CalculadoraMementable();
        this.commandManager = new CommandManager();
        this.commandManager.add(new AddCommand(calculator));
        this.commandManager.add(new SubtractCommand(calculator));
        this.commandManager.add(new ResetCommand(calculator));
        this.commandManager.add(new PrintCommand(calculator));
        this.commandManager.add(new ComandoGuardar(calculator));
        this.commandManager.add(new ComandoDeshacer(calculator));
    }

    public void execute() {
        String key = (String) IO.getIO().select(this.commandManager.keys());
        this.commandManager.execute(key);
    }

    public static void main(String[] args) {
        IO.getIO().addView(new MainCalculadoraMementable());
    }
}
