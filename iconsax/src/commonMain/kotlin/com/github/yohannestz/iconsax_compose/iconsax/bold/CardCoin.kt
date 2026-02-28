package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CardCoin: ImageVector
    get() {
        val current = _cardCoin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.CardCoin",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 15.7f)
                verticalLineToRelative(dy = 0.11f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = 0.5f)
                horizontalLineToRelative(dx = -9.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.5f, dy1 = -0.5f)
                verticalLineTo(y = 15.7f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.76f, dx2 = 0.44f, dy2 = -2.2f, dx3 = 2.22f, dy3 = -2.2f)
                horizontalLineToRelative(dx = 5.56f)
                curveToRelative(dx1 = 1.78f, dy1 = 0.0f, dx2 = 2.22f, dy2 = 0.44f, dx3 = 2.22f, dy3 = 2.2f)
                moveToRelative(dx = -9.5f, dy = 1.6f)
                arcTo(horizontalEllipseRadius = 0.5f, verticalEllipseRadius = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.0f, y1 = 17.8f)
                verticalLineToRelative(dy = 2.0f)
                curveTo(x1 = 2.0f, y1 = 21.56f, x2 = 2.44f, y2 = 22.0f, x3 = 4.22f, y3 = 22.0f)
                horizontalLineToRelative(dx = 5.56f)
                curveToRelative(dx1 = 1.78f, dy1 = 0.0f, dx2 = 2.22f, dy2 = -0.44f, dx3 = 2.22f, dy3 = -2.2f)
                verticalLineToRelative(dy = -2.0f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.5f, dy1 = -0.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 22.0f, y = 15.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -7.0f, dy1 = 7.0f)
                lineToRelative(dx = 1.05f, dy = -1.75f)
                moveTo(x = 2.0f, y = 9.0f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.0f, dy1 = -7.0f)
                lineTo(x = 7.95f, y = 3.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.5f, y = 11.0f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -9.0f)
                arcToRelative(a = 4.5f, b = 4.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 9.0f)
            }
        }.build().also { _cardCoin = it }
    }

@Suppress("ObjectPropertyName")
private var _cardCoin: ImageVector? = null
