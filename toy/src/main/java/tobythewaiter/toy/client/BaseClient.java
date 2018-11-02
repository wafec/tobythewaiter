package tobythewaiter.toy.client;

import org.springframework.web.client.RestTemplate;

public abstract class BaseClient <TPostObject, TPostResult, TGetResult> {
    private RestTemplate restTemplate;
    private String url;
    private Class<TPostResult> postResultClass;
    private Class<TGetResult> getResultClass;

    protected BaseClient(String url, Class<TPostResult> postResultClass, Class<TGetResult> getResultClass) {
        restTemplate = new RestTemplate();
        this.url = url;
        this.postResultClass = postResultClass;
        this.getResultClass = getResultClass;
    }

    public TPostResult post(TPostObject postObject) {
        TPostResult postResult = restTemplate.postForObject(url, postObject, postResultClass);
        return postResult;
    }

    public TGetResult get(Integer id) {
        TGetResult getResult = restTemplate.getForObject(url + id, getResultClass);
        return getResult;
    }
}
