package com.laioffer.onlineorder.model;


import com.fasterxml.jackson.annotation.JsonProperty;


public record RegisterBody(
        String email,
        String password,
        @JsonProperty("first_name") String firstName,
        //JsonProperty：发request的时候，需要转换命名方法到snake case
        @JsonProperty("last_name") String lastName
) {
}
