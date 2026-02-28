package com.github.yohannestz.iconsax_compose.iconsax.bold

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
                moveTo(x = 19.63f, y = 7.24f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.34f, dy1 = 1.39f)
                lineTo(x = 18.7f, y = 8.98f)
                lineTo(x = 5.59f, y = 16.84f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.39f, dy1 = -0.36f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.49f, dy1 = -13.4f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 8.94f, dy1 = 4.16f)
                moveToRelative(dx = 1.26f, dy = 6.19f)
                arcTo(horizontalEllipseRadius = 9.1f, verticalEllipseRadius = 9.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.14f, y1 = 21.0f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.12f, dy1 = -1.51f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.04f, dy1 = -1.71f)
                lineToRelative(dx = 12.41f, dy = -7.29f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.51f, dy1 = 0.81f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.09f, dy1 = 2.13f)
            }
        }.build().also { _record = it }
    }

@Suppress("ObjectPropertyName")
private var _record: ImageVector? = null
