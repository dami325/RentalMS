package com.msa.rental.domain.model;

import com.msa.rental.domain.model.vo.Item;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RentalItem {

    private Item item;
    private LocalDate rentalDate;
    private boolean overdued;

    private LocalDate overdueDate; // 반납예정일

    public static RentalItem createRentalItem(Item item)
    {
        return new RentalItem(item, LocalDate.now(), false, LocalDate.now().plusDays(14));
    }

    public static RentalItem sample(){
        return RentalItem.createRentalItem(Item.sample());
    }
}