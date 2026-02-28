package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShieldSearch: ImageVector
    get() {
        val current = _shieldSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ShieldSearch",
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
                moveTo(x = 3.41f, y = 11.02f)
                verticalLineToRelative(dy = 3.54f)
                arcTo(horizontalEllipseRadius = 4.9f, verticalEllipseRadius = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.14f, y1 = 18.0f)
                lineToRelative(dx = 4.3f, dy = 3.21f)
                arcTo(horizontalEllipseRadius = 4.3f, verticalEllipseRadius = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 22.0f)
                moveToRelative(dx = 8.59f, dy = -11.45f)
                verticalLineTo(y = 7.12f)
                arcTo(horizontalEllipseRadius = 3.5f, verticalEllipseRadius = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 18.5f, y1 = 4.1f)
                lineToRelative(dx = -4.99f, dy = -1.87f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.02f, dy1 = 0.0f)
                lineTo(x = 5.5f, y = 4.1f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.09f, dy1 = 3.0f)
                moveTo(x = 20.0f, y = 16.02f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -2.31f, dy1 = -3.62f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 21.0f, y = 21.0f)
                close()
            }
        }.build().also { _shieldSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _shieldSearch: ImageVector? = null
