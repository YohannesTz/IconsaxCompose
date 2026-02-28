package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val QuoteUpCircle: ImageVector
    get() {
        val current = _quoteUpCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.QuoteUpCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.8f, y = 7.22f)
                horizontalLineToRelative(dx = -1.48f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = 1.94f)
                verticalLineToRelative(dy = 1.49f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.94f, dy1 = 1.94f)
                horizontalLineToRelative(dx = 1.9f)
                curveToRelative(dx1 = -0.07f, dy1 = 1.8f, dx2 = -0.5f, dy2 = 2.08f, dx3 = -1.7f, dy3 = 2.79f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.26f, dy1 = 1.03f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.65f, dy1 = 0.37f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.38f, dy1 = -0.1f)
                curveToRelative(dx1 = 1.79f, dy1 = -1.06f, dx2 = 2.46f, dy2 = -1.75f, dx3 = 2.46f, dy3 = -4.83f)
                verticalLineTo(y = 9.18f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = -1.96f)
                moveToRelative(dx = -6.12f, dy = 0.0f)
                horizontalLineTo(x = 8.19f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = 1.94f)
                verticalLineToRelative(dy = 1.49f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.94f, dy1 = 1.94f)
                horizontalLineToRelative(dx = 1.91f)
                curveToRelative(dx1 = -0.08f, dy1 = 1.8f, dx2 = -0.5f, dy2 = 2.08f, dx3 = -1.71f, dy3 = 2.79f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.26f, dy1 = 1.03f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.65f, dy1 = 0.37f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.38f, dy1 = -0.1f)
                curveToRelative(dx1 = 1.79f, dy1 = -1.06f, dx2 = 2.46f, dy2 = -1.75f, dx3 = 2.46f, dy3 = -4.83f)
                verticalLineTo(y = 9.18f)
                arcToRelative(a = 1.96f, b = 1.96f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.94f, dy1 = -1.96f)
            }
        }.build().also { _quoteUpCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _quoteUpCircle: ImageVector? = null
