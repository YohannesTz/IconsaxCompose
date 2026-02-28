package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
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
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.5f, y = 11.0f)
                verticalLineToRelative(dy = 7.3f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.66f, dx2 = 1.46f, dy2 = 3.29f, dx3 = 3.23f, dy3 = 1.39f)
                lineToRelative(dx = 0.01f, dy = -0.01f)
                arcToRelative(a = 1.76f, b = 1.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.78f, dy1 = 0.15f)
                lineToRelative(dx = 1.01f, dy = 1.35f)
                moveToRelative(dx = 9.97f, dy = -9.88f)
                verticalLineTo(y = 7.04f)
                curveTo(x1 = 20.5f, y1 = 3.01f, x2 = 19.56f, y2 = 2.0f, x3 = 15.78f, y3 = 2.0f)
                horizontalLineTo(x = 8.22f)
                curveTo(x1 = 4.44f, y1 = 2.0f, x2 = 3.5f, y2 = 3.01f, x3 = 3.5f, y3 = 7.04f)
                moveTo(x = 18.2f, y = 21.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -6.4f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.4f)
                moveTo(x = 22.0f, y = 22.0f)
                lineToRelative(dx = -1.0f, dy = -1.0f)
                moveTo(x = 8.0f, y = 7.0f)
                horizontalLineToRelative(dx = 8.0f)
                moveToRelative(dx = -7.0f, dy = 4.0f)
                horizontalLineToRelative(dx = 6.0f)
            }
        }.build().also { _receiptSearch = it }
    }

@Suppress("ObjectPropertyName")
private var _receiptSearch: ImageVector? = null
