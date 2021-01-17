package com.soten.designpattern.observer;

import com.soten.designpattern.observer.publisher.NewsMachine;

public class MainObserver {

    public static void main(String[] args) {
        NewsMachine newsMachine = new NewsMachine();
        AnnualSubscriber annualSubscriber = new AnnualSubscriber(newsMachine);
        EventSubscriber eventSubscriber = new EventSubscriber(newsMachine);

        newsMachine.publish("오늘 한파", "전국 영하 18도 입니다.");

        System.out.println();
//        newsMachine.delete(eventSubscriber);
        eventSubscriber.withdraw();

        newsMachine.publish("벚꽃 축제합니다", "다 같이 벚꽃보러~");

    }
}
