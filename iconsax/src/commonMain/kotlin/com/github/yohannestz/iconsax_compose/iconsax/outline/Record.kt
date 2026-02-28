package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Record: ImageVector
    get() {
        val current = _record
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Record",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 21.75f)
                arcToRelative(a = 9.76f, b = 9.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.01f, dy1 = -19.51f)
                arcTo(horizontalEllipseRadius = 9.76f, verticalEllipseRadius = 9.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 21.75f)
                moveToRelative(dx = 0.0f, dy = -18.0f)
                arcToRelative(a = 8.26f, b = 8.26f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.02f, dy1 = 16.52f)
                arcTo(horizontalEllipseRadius = 8.26f, verticalEllipseRadius = 8.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 3.75f)
            }
        }.build().also { _record = it }
    }

@Suppress("ObjectPropertyName")
private var _record: ImageVector? = null
