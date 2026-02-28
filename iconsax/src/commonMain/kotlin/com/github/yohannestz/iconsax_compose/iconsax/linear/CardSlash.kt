package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardSlash: ImageVector
    get() {
        val current = _cardSlash
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardSlash",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 8.5f)
                horizontalLineToRelative(dx = 13.24f)
                moveTo(x = 6.0f, y = 16.5f)
                horizontalLineToRelative(dx = 1.29f)
                moveToRelative(dx = 3.71f, dy = 0.0f)
                horizontalLineToRelative(dx = 3.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.98f, y = 20.5f)
                horizontalLineToRelative(dx = 9.58f)
                curveToRelative(dx1 = 3.56f, dy1 = 0.0f, dx2 = 4.44f, dy2 = -0.88f, dx3 = 4.44f, dy3 = -4.39f)
                verticalLineTo(y = 6.89f)
                moveToRelative(dx = -2.01f, dy = -3.14f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.43f, dy1 = -0.25f)
                horizontalLineTo(x = 6.44f)
                curveTo(x1 = 2.89f, y1 = 3.5f, x2 = 2.0f, y2 = 4.38f, x3 = 2.0f, y3 = 7.89f)
                verticalLineToRelative(dy = 8.21f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.34f, dx2 = 0.39f, dy2 = 3.51f, dx3 = 1.71f, dy3 = 4.03f)
                moveTo(x = 22.0f, y = 2.0f)
                lineTo(x = 2.0f, y = 22.0f)
            }
        }.build().also { _cardSlash = it }
    }

@Suppress("ObjectPropertyName")
private var _cardSlash: ImageVector? = null
