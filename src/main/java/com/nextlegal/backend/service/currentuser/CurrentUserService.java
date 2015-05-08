package com.nextlegal.backend.service.currentuser;

import com.nextlegal.backend.domain.CurrentUser;

public interface CurrentUserService {

    boolean canAccessUser(CurrentUser currentUser, Long userId);

}
