package es.neesis.annotations.services;

public class DivService implements IOperationService{

    @Override
    public int realizeOperation(int operando1, int operando2) {
        return operando1/operando2;
    }
}
