package es.neesis.annotations.applications;

import es.neesis.annotations.services.IOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutowiredApplication {

    @Autowired
    private IOperationService operationService;

    public int realizeOperation (int operando1, int operando2) {
        return this.operationService.realizeOperation(operando1,operando2);
    }
}
