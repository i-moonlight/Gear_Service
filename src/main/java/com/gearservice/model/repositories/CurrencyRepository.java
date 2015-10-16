package com.gearservice.model.repositories;

import com.gearservice.model.currency.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {
}
