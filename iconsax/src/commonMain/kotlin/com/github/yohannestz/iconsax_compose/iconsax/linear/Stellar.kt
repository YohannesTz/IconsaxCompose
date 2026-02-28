package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Stellar: ImageVector
    get() {
        val current = _stellar
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Stellar",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF17191C)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 16.4f, y = 5.0f)
                arcTo(horizontalEllipseRadius = 8.3f, verticalEllipseRadius = 8.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 3.8f)
                arcToRelative(a = 8.17f, b = 8.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.9f, dy1 = 10.4f)
                moveTo(x = 7.6f, y = 19.0f)
                arcToRelative(a = 8.17f, b = 8.17f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 12.6f, dy1 = -6.9f)
                quadToRelative(dx1 = 0.0f, dy1 = -1.2f, dx2 = -0.3f, dy2 = -2.4f)
                moveTo(x = 2.0f, y = 16.0f)
                lineTo(x = 22.0f, y = 5.0f)
                moveToRelative(dx = 0.0f, dy = 3.5f)
                lineToRelative(dx = -20.0f, dy = 11.0f)
            }
        }.build().also { _stellar = it }
    }

@Suppress("ObjectPropertyName")
private var _stellar: ImageVector? = null
