package com.elvin.multiplefragmentdemo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Elvin Shrestha on 05/12/19
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private String name;
    private String phoneNumber;
    private int imageId;

}
