package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LinkTwo: ImageVector
    get() {
        val current = _linkTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.LinkTwo",
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
                moveTo(x = 14.99f, y = 17.5f)
                horizontalLineToRelative(dx = 1.5f)
                curveToRelative(dx1 = 3.03f, dy1 = 0.0f, dx2 = 5.5f, dy2 = -2.47f, dx3 = 5.5f, dy3 = -5.5f)
                reflectiveCurveToRelative(dx1 = -2.46f, dy1 = -5.5f, dx2 = -5.5f, dy2 = -5.5f)
                horizontalLineTo(x = 15.0f)
                moveTo(x = 2.37f, y = 10.01f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.13f, dy1 = 7.5f)
                horizontalLineTo(x = 9.0f)
                moveTo(x = 9.0f, y = 6.5f)
                horizontalLineTo(x = 7.5f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.32f, dy1 = 0.51f)
                moveTo(x = 8.0f, y = 12.0f)
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _linkTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _linkTwo: ImageVector? = null
