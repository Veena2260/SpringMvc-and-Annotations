package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import entity.User;
import repository.UserRepository;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userRepository;

	public boolean login(User user) {
		final List<User> loginUser = userRepository
				.findByEmailAndPassword(user.getEmail(), user.getPassword());

		if (loginUser != null && !loginUser.isEmpty()
				&& loginUser.size() > 0) {
			return true;
		}

		return false;
	}

	public boolean login1(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}