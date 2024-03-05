package es.neesis.annotations.services;

import org.springframework.stereotype.Service;

@Service
public class AddService implements IOperationService{

    @Override
    public int realizeOperation(int operando1, int operando2) {
        return operando1 + operando2;
    }
}
