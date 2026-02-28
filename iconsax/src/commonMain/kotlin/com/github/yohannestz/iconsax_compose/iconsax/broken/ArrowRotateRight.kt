package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ArrowRotateRight: ImageVector
    get() {
        val current = _arrowRotateRight
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ArrowRotateRight",
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
                moveTo(x = 3.33f, y = 13.33f)
                arcToRelative(a = 8.67f, b = 8.67f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 15.88f, dy1 = -4.82f)
                moveToRelative(dx = -4.32f, dy = -3.43f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 4.65f)
                arcToRelative(a = 8.7f, b = 8.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -7.51f, dy1 = 4.34f)
                moveToRelative(dx = 10.64f, dy = -3.67f)
                lineTo(x = 12.24f, y = 2.0f)
                moveToRelative(dx = 2.89f, dy = 3.32f)
                lineToRelative(dx = -3.37f, dy = 2.46f)
            }
        }.build().also { _arrowRotateRight = it }
    }

@Suppress("ObjectPropertyName")
private var _arrowRotateRight: ImageVector? = null
