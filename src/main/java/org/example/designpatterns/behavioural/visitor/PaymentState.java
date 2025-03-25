package org.example.designpatterns.behavioural.visitor;

public enum PaymentState {
    CREATED {
        @Override
        <T> T accept(PaymentStateVisitor<T> visitor) {
            return visitor.visitCreated();
        }
    }, INIT {
        @Override
        <T> T accept(PaymentStateVisitor<T> visitor) {
            return visitor.visitInit();
        }
    }, COMPLETED {
        @Override
        <T> T accept(PaymentStateVisitor<T> visitor) {
            return visitor.visitCompleted();
        }
    }, FAILED {
        @Override
        <T> T accept(PaymentStateVisitor<T> visitor) {
            return visitor.visitFailed();
        }
    };

    abstract <T> T accept(PaymentStateVisitor<T> visitor);

    public interface PaymentStateVisitor<T> {
        T visitCreated();
        T visitInit();
        T visitCompleted();
        T visitFailed();
    }

    public static void main(String[] args) {
        PaymentState state = PaymentState.INIT;

        state.accept(new PaymentStateVisitor<Void>() {
            @Override
            public Void visitCreated() {
                return null;
            }

            @Override
            public Void visitInit() {
                return null;
            }

            @Override
            public Void visitCompleted() {
                return null;
            }

            @Override
            public Void visitFailed() {
                return null;
            }
        });
    }
}
