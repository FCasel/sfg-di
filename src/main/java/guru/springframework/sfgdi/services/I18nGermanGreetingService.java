package guru.springframework.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"GER", "default"})
@Service("i18nService")
public class I18nGermanGreetingService implements GreetingService{
    @Override
    public String sayGreeting(){
        return "Gruess Gott";
    }
}
