package com.premkumar.notification;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
@ToString
public class Notification {

    @Id
    @SequenceGenerator(name = "notifications_id_sequence", sequenceName = "notifications_id_sequence"

    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "notifications_id_sequence")
    private Integer notificationId;
    private Integer toCustomerId;
    private String toCustomerEmail;
    private String sender;
    private String message;
    private LocalDateTime sentAt;


}
