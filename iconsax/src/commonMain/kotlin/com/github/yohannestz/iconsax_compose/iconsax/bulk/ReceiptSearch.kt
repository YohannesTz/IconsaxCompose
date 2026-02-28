package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ReceiptSearch: ImageVector
    get() {
        val current = _receiptSearch
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ReceiptSearch",
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
                moveTo(x = 6.73f, y = 19.7f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.79f, dy1 = 0.15f)
                lineToRelative(dx = 1.0f, dy = 1.35f)
                curveToRelative(dx1 = 0.82f, dy1 = 1.07f, dx2 = 2.13f, dy2 = 1.07f, dx3 = 2.94f, dy3 = 0.0f)
                lineToRelative(dx = 1.0f, dy = -1.35f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.8f, dy1 = -0.15f)
                curveToRelative(dx1 = 1.78f, dy1 = 1.9f, dx2 = 3.23f, dy2 = 1.27f, dx3 = 3.23f, dy3 = -1.39f)
                verticalLineTo(y = 7.05f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.03f, dx2 = -0.94f, dy2 = -5.04f, dx3 = -4.72f, dy3 = -5.04f)
                horizontalLineTo(x = 8.2f)
                curveToRelative(dx1 = -3.78f, dy1 = 0.0f, dx2 = -4.72f, dy2 = 1.01f, dx3 = -4.72f, dy3 = 5.04f)
                verticalLineToRelative(dy = 11.26f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.66f, dx2 = 1.47f, dy2 = 3.28f, dx3 = 3.24f, dy3 = 1.4f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.66f, y = 13.47f)
                lineToRelative(dx = -0.74f, dy = -0.74f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = -1.06f, dy1 = 1.06f)
                lineToRelative(dx = 0.74f, dy = 0.74f)
                quadToRelative(dx1 = 0.23f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
            }
        }.build().also { _receiptSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptSearch: ImageVector? = null
