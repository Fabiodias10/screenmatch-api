package br.com.alura.screenmatch.service;
import br.com.alura.screenmatch.config.OpenAiConfig;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.service.OpenAiService;
import org.springframework.stereotype.Service;


@Service
public class ConsultaChatGPT {

    private static OpenAiService service;

    public ConsultaChatGPT(OpenAiConfig config) {
        this.service = new OpenAiService(config.getApiKey());
    }

    public static String obterTraducao(String texto) {

        CompletionRequest requisicao = CompletionRequest.builder()
                .model("gpt-3.5-turbo-instruct")
                .prompt("traduza para o português o texto: " + texto)
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var resposta = service.createCompletion(requisicao);
        return resposta.getChoices().get(0).getText();
    }
}