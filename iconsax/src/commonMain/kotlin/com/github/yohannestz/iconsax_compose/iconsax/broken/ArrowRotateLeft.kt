package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowRotateLeft: ImageVector
    get() {
        val current = _arrowRotateLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowRotateLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 20.67f, y = 13.33f)
                arcTo(horizontalEllipseRadius = 8.67f, verticalEllipseRadius = 8.67f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, x1 = 4.79f, y1 = 8.51f)
                moveToRelative(dx = 4.32f, dy = -3.43f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 4.65f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.51f, dy1 = 4.34f)
                moveTo(x = 7.87f, y = 5.32f)
                lineTo(x = 10.76f, y = 2.0f)
                moveTo(x = 7.87f, y = 5.32f)
                lineToRelative(dx = 3.37f, dy = 2.46f)
            }
        }.build().also { _arrowRotateLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRotateLeft: ImageVector? = null
