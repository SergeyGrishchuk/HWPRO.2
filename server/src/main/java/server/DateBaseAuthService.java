package server;

public class DateBaseAuthService implements AuthService{
    @Override
    public String getNicknameByLoginAndPassword (String login, String password){
        return BaseHandler.getNicknameByLoginAndPassword(login, password);
    }

    @Override
    public boolean registration(String login, String password, String nickname){
        return BaseHandler.registation(login, password, nickname);
    }

    @Override
    public boolean changeNickname(String oldNick, String newNick){
        return BaseHandler.changeNickname(oldNick, newNick);
    }
}
