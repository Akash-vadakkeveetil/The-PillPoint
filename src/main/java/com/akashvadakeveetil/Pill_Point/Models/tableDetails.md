### The table Details

### Admins table
- admin_id: primary key
- username: admin's username
- password: admin's password

### Pharmacies table
- pharmacy_id: primary key
- medicine_id: foreign key linking medicines table
- current_stock: current stock of the medicine in the pharmacy
- last_updated: timestamp of the last stock update
- pharmacy_name: name of the pharmacy
- pharmacy_address: address of the pharmacy
- contact_no: contact number of the pharmacy
- license_no: unique license number of the pharmacy (new)
 
### Suppliers table
- supplier_id: primary key
- supplier_name: name of the supplier company
- email: email address of the supplier
- contact_no: contact number of the supplier
- medicine_id: foreign key linking medicines table
- address: address of the supplier
- stock_available: amount of stock available
- supplier_type: type of supplier (manufacturer/distributor) (new)

### Medicines table
- medicine_id: primary key
- name: name of the medicine
- category: category of the medicine
- description: description of the medicine
- manufacturer_id: foreign key linking suppliers table
- threshold: minimum stock threshold for the medicine
- quantity: quantity of the medicine
- expiry_date: expiration date of the medicine (new)

### Orders table

- order_id: primary key
- pharmacy_id: foreign key linking pharmacies table
- medicine_id: foreign key linking medicines table
- supplier_id: foreign key linking suppliers table
- quantity: quantity of the medicine ordered
- status: status of the order (pending/rejected/delivered)
- ordered_at: timestamp of when the order was placed
- delivered_at: timestamp of when the order was delivered

### Alerts table
- alert_id: primary key
- pharmacy_id: foreign key linking pharmacies table
- medicine_id: foreign key linking medicines table
- created_at: timestamp of alert creation
- resolved: true or false (boolean) to indicate resolution
- alert_message: descriptive message about the alert
- alert_type: type of alert (low stock, out of stock, etc.)
- resolved_at: timestamp of when the alert was resolved