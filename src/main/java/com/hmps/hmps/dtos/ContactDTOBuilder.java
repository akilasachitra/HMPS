package com.hmps.hmps.dtos;

/**
 * builder class for ContactDTO
 */
public final class ContactDTOBuilder {
    private long id;
    private String address1;
    private String address2;
    private String address3;
    private String telephone1;
    private String telephone2;
    private String fax;
    private String email;

    private ContactDTOBuilder() {
    }

    public static ContactDTOBuilder getInstance() {
        return new ContactDTOBuilder();
    }

    public ContactDTOBuilder setId(long id) {
        this.id = id;
        return this;
    }

    public ContactDTOBuilder setAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    public ContactDTOBuilder setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }

    public ContactDTOBuilder setAddress3(String address3) {
        this.address3 = address3;
        return this;
    }

    public ContactDTOBuilder setTelephone1(String telephone1) {
        this.telephone1 = telephone1;
        return this;
    }

    public ContactDTOBuilder setTelephone2(String telephone2) {
        this.telephone2 = telephone2;
        return this;
    }

    public ContactDTOBuilder setFax(String fax) {
        this.fax = fax;
        return this;
    }

    public ContactDTOBuilder setEmail(String email) {
        this.email = email;
        return this;
    }

    public ContactDTO build() {
        ContactDTO contactDTO = new ContactDTO();
        contactDTO.setId(id);
        contactDTO.setAddress1(address1);
        contactDTO.setAddress2(address2);
        contactDTO.setAddress3(address3);
        contactDTO.setTelephone1(telephone1);
        contactDTO.setTelephone2(telephone2);
        contactDTO.setFax(fax);
        contactDTO.setEmail(email);
        return contactDTO;
    }
}
