package ch09.nestedClassAndNestedInterface.exam06;

public class Button {

    OnClickListener listener;

    void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick(); // 구현 객체의 onClick() 메소드 호출
    }

    // 중첩 인터페이스
    static interface OnClickListener{
        void onClick();
    }
}
