package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ShieldSlash: ImageVector
    get() {
        val current = _shieldSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ShieldSlash",
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
                moveTo(x = 7.84f, y = 20.02f)
                lineToRelative(dx = 1.59f, dy = 1.2f)
                arcToRelative(a = 4.55f, b = 4.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.14f, dy1 = 0.0f)
                lineToRelative(dx = 4.3f, dy = -3.22f)
                arcToRelative(a = 4.9f, b = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.73f, dy1 = -3.44f)
                verticalLineTo(y = 7.12f)
                moveTo(x = 3.41f, y = 11.04f)
                verticalLineToRelative(dy = 3.52f)
                arcTo(horizontalEllipseRadius = 4.9f, verticalEllipseRadius = 4.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.14f, y1 = 18.0f)
                lineToRelative(dx = 0.2f, dy = 0.15f)
                moveTo(x = 18.98f, y = 4.34f)
                lineTo(x = 18.51f, y = 4.1f)
                lineToRelative(dx = -4.99f, dy = -1.87f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.02f, dy1 = 0.0f)
                lineToRelative(dx = -5.0f, dy = 1.88f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.09f, dy1 = 3.0f)
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
        }.build().also { _shieldSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _shieldSlash: ImageVector? = null
