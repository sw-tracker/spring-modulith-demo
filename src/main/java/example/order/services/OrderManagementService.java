/*
 * Copyright 2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package example.order.services;

import example.customer.Customer.CustomerIdentifier;
import example.order.repositories.OrderRepository;
import example.order.spi.Order;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import org.jmolecules.ddd.annotation.Service;

/**
 * @author Oliver Drotbohm
 */
@Transactional
@Service
@RequiredArgsConstructor
public class OrderManagementService {

	private final OrderRepository orders;

	public Order create(CustomerIdentifier customerId) {
		return new Order(customerId);
	}

	public Order complete(Order order) {
		return orders.save(order.complete());
	}
}
