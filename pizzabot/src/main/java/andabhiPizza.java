import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class andabhiPizza extends TelegramLongPollingBot {


    @Override
    public void onUpdateReceived(Update update) {
        final String messageTextReceived = update.getMessage().getText();

        final long chatId = update.getMessage().getChatId();

        SendMessage message = new SendMessage().setChatId(chatId).setText(messageTextReceived);

        try{
            execute(message);
        }catch (TelegramApiException e){
            e.printStackTrace();
        }
    }

    @Override
    public String getBotUsername() {
        return "AndabhiBot";
    }

    @Override
    public String getBotToken() {
        return "1117102974:AAHBbpSWTE4sTSgDHOjKSXY2rjl_Qw6sM10";
    }
}
