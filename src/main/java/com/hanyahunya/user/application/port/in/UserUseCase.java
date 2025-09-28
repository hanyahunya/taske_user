package com.hanyahunya.user.application.port.in;

import com.hanyahunya.user.application.dto.AddUserCommand;

public interface UserUseCase {
    void addUser(AddUserCommand command);
}
