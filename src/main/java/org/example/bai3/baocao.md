## 1. Input / Output

### Input:

- withdrawAmount

### Các giá trị có thể nhận:

- null
- số âm (vd: -50000)
- số không hợp lệ (vd: 55000)
- số hợp lệ (vd: 60000, 150000)

### Output:

- Valid: giá trị hợp lệ theo rule nghiệp vụ
- Invalid: trả về lỗi validation với message tương ứng

---

## 2. Rule nghiệp vụ

Số tiền rút (withdrawAmount) phải thỏa mãn đồng thời:

1. withdrawAmount >= 50.000
2. withdrawAmount % 10.000 == 0
3. Không được null hoặc giá trị âm

---

## 3. Đề xuất giải pháp

Sử dụng Custom Annotation: @MultipleOfTenThousand

### Lý do:

- Tách biệt logic nghiệp vụ khỏi Controller (Clean Code)
- Tái sử dụng cho nhiều DTO khác nhau
- Dễ test và bảo trì
- Tuân thủ Bean Validation standard

---

## 4. Pseudocode Validator

IF withdrawAmount == null  
RETURN invalid

IF withdrawAmount < 50000  
RETURN invalid

IF withdrawAmount % 10000 != 0  
RETURN invalid

RETURN valid

---

## 5. Luồng xử lý

Client Request  
→ DTO nhận dữ liệu  
→ Bean Validation chạy @MultipleOfTenThousand  
→ Validator kiểm tra rule  
→ Sai: trả về validation error  
→ Đúng: tiếp tục business logic