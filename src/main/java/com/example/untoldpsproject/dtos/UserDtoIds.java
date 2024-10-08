package com.example.untoldpsproject.dtos;

import com.example.untoldpsproject.entities.Order;
import lombok.*;

import java.util.List;
import java.util.Set;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDtoIds {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private List<String> orders;
}
