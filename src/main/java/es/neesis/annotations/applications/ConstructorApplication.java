package es.neesis.annotations.applications;

import es.neesis.annotations.services.IOperationService;
import org.springframework.stereotype.Component;

@Component
public class ConstructorApplication {

        private final IOperationService operationService;

        public ConstructorApplication(IOperationService operationService) {
            this.operationService = operationService;
        }

        public int realizeOperation(int operando1, int operando2) {
            return operationService.realizeOperation(operando1, operando2);
        }
}
