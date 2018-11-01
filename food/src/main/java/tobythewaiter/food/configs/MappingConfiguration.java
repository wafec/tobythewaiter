package tobythewaiter.food.configs;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MappingConfiguration {
    @Bean(name="org.dozer.Mapper")
    public DozerBeanMapper getDozerBeanMapper() {
        List<String> mappingFiles = Arrays.asList(
                "dozer-global-configs.xml"
        );
        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        dozerBeanMapper.setMappingFiles(mappingFiles);
        return dozerBeanMapper;
    }
}
